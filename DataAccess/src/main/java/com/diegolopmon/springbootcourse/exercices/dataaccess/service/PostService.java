package com.diegolopmon.springbootcourse.exercices.dataaccess.service;

import com.diegolopmon.springbootcourse.exercices.dataaccess.domain.Post;
import com.diegolopmon.springbootcourse.exercices.dataaccess.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> list() {
        return postRepository.findAllByOrderByPostedOnDesc();
    }
}
