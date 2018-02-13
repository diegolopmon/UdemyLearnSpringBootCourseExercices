package com.diegolopmon.springbootcourse.exercices.restapi.service;

import com.diegolopmon.springbootcourse.exercices.restapi.domain.Book;
import com.diegolopmon.springbootcourse.exercices.restapi.repository.AuthorRepository;
import com.diegolopmon.springbootcourse.exercices.restapi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BookService {
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    @Autowired
    public BookService(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Transactional
    public Book create(Book book) {
        authorRepository.save(book.getAuthor());
        return bookRepository.save(book);
    }

    public Book read(Long id) {
        return bookRepository.findOne(id);
    }

    public Iterable<Book> list() {
        return bookRepository.findAll();
    }

    public Book update(Long id, Book bookUpdate) {
        Book book = bookRepository.findOne(id);
        book.setName(bookUpdate.getName());
        return bookRepository.save(book);
    }

    public void delete(Long id) {
        bookRepository.delete(id);
    }
}
