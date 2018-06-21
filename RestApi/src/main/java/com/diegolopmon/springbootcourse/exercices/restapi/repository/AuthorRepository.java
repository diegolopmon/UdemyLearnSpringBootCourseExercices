package com.diegolopmon.springbootcourse.exercices.restapi.repository;

import com.diegolopmon.springbootcourse.exercices.restapi.domain.Author;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {
    List<Author> findByFirstNameContaining(@Param("firstName") String firstName);
}
