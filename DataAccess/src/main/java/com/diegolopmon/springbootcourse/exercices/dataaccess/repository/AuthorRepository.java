package com.diegolopmon.springbootcourse.exercices.dataaccess.repository;

import com.diegolopmon.springbootcourse.exercices.dataaccess.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
