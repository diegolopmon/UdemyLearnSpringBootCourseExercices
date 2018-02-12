package com.diegolopmon.springbootcourse.exercices.restapi.repository;

import com.diegolopmon.springbootcourse.exercices.restapi.domain.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorRepository extends CrudRepository<Author, Long> {
    Author findFirstByAuthorByFirstNameAndLastName();
    Author findAuthorById();
    List<Author> findAll();
}
