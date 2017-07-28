package com.diegolopmon.springbootcourse.exercices.dataaccess.service;

import com.diegolopmon.springbootcourse.exercices.dataaccess.domain.Author;
import com.diegolopmon.springbootcourse.exercices.dataaccess.domain.Post;
import com.diegolopmon.springbootcourse.exercices.dataaccess.repository.AuthorRepository;
import com.diegolopmon.springbootcourse.exercices.dataaccess.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class DataLoader {

    private AuthorRepository authorRepository;
    private PostRepository postRepository;

    @Autowired
    public DataLoader(AuthorRepository authorRepository, PostRepository postRepository) {
        this.authorRepository = authorRepository;
        this.postRepository = postRepository;
    }

    @PostConstruct
    private void loadData() {

        Author author = new Author("Diego", "Lopez");
        authorRepository.save(author);

        Post post = new Post(
                "My very first post",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
                new Date(),
                author);
        postRepository.save(post);
    }
}
