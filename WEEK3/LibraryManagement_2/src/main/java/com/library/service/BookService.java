package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    public void checkingInjection(){
        bookRepository.checkingConnection();
    }
    public void checkingConnection(){
        System.out.println("Connection Success");
    }
}
