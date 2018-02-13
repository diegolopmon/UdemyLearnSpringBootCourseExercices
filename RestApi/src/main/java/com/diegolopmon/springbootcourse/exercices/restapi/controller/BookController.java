package com.diegolopmon.springbootcourse.exercices.restapi.controller;

import com.diegolopmon.springbootcourse.exercices.restapi.domain.Book;
import com.diegolopmon.springbootcourse.exercices.restapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Book create(@RequestBody Book book) {
        return bookService.create(book);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Iterable<Book> list() {
        return bookService.list();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book read(@PathVariable(value = "id") Long id) {
        return bookService.read(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Book update(@PathVariable(value = "id") Long id, @RequestBody Book book) {
        return bookService.update(id, book);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") Long id) {
        bookService.delete(id);
    }
}
