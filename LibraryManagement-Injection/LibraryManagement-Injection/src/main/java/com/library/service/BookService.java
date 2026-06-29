package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private String serviceName;
    private BookRepository bookRepository;

    public BookService(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {
        System.out.println(serviceName + ": Adding a book...");
        bookRepository.saveBook();
    }
}
