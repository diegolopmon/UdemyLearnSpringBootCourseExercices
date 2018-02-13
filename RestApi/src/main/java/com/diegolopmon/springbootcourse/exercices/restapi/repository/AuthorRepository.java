package com.diegolopmon.springbootcourse.exercices.restapi.repository;

import com.diegolopmon.springbootcourse.exercices.restapi.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
