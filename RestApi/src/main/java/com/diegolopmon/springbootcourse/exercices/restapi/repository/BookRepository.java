package com.diegolopmon.springbootcourse.exercices.restapi.repository;

import com.diegolopmon.springbootcourse.exercices.restapi.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
    Book findFirstByName();
    Book findAllByAuthor();
}
