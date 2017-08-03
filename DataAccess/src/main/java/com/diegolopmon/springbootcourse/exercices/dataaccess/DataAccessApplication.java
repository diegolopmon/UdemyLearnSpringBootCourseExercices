package com.diegolopmon.springbootcourse.exercices.dataaccess;


import com.diegolopmon.springbootcourse.exercices.dataaccess.service.DataLoader;
import com.diegolopmon.springbootcourse.exercices.dataaccess.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableAutoConfiguration
public class DataAccessApplication {

	private DataLoader dataLoader;

	private PostService postService;

	@Autowired
	private void setDataLoader(DataLoader dataLoader) {
		this.dataLoader = dataLoader;
	}

	@Autowired
	private void setPostService(PostService postService) {
		this.postService = postService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DataAccessApplication.class, args);
	}

	/**
	 * Quick and dirty test of postService
	 */
	@PostConstruct
	private void listServices() {
		postService.list().forEach(post -> System.out.println(post.toString()));
	}

}
