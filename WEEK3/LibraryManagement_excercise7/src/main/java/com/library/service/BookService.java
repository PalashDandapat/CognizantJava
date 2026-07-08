package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    public BookService(BookRepository bookRepository){
        this.bookRepository=bookRepository;
        System.out.println("BookRepository Initialised thorugh Constructor in BookService");
    }
    public  void setBookRepository(BookRepository bookRepository){
        this.bookRepository=bookRepository;
        System.out.println("BookRepository Set through Setter in BookService");
    }
    public void initialised(){
        System.out.println("BookService Initialised");
    }
}
