package com.diegolopmon.springbootcourse.exercices.dataaccess.repository;

import com.diegolopmon.springbootcourse.exercices.dataaccess.domain.Author;
import com.diegolopmon.springbootcourse.exercices.dataaccess.domain.Post;
import com.diegolopmon.springbootcourse.exercices.dataaccess.service.DataLoader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PostRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private PostRepository postRepository;

    @Before
    public void before() {
        Author author1 = new Author("Diego", "Lopez");
        Author author2 = new Author("Foo", "Bar");

        entityManager.persist(author1);
        entityManager.persist(author2);

        Post post1 = new Post("Title1","Body1", new Date(1502126311L), author1);
        Post post2 = new Post("Title2","Body2", new Date(1502126341L), author2);

        entityManager.persist(post1);
        entityManager.persist(post2);
    }

    @Test
    public void findAllByOrderByPostedOnDesc() throws Exception {
        List<Post> posts = postRepository.findAllByOrderByPostedOnDesc();

        Assert.assertEquals(2, posts.size());
        Assert.assertEquals("Title2", posts.get(0).getTitle());
        Assert.assertEquals("Title1", posts.get(1).getTitle());
    }

    @Test
    public void findFirstByOrderByPostedOnDesc() throws Exception {
        Post post = postRepository.findFirstByOrderByPostedOnDesc();

        Assert.assertEquals("Title2", post.getTitle());
    }

}