package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.entity.Book;
import com.example.LibraryManagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library/books")
public class controller {
    @Autowired
    private BookRepository bookRepository;
    @GetMapping
    public List<Book> getAllBooks(){
        return bookRepository.findAll();

    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Integer id){
        return bookRepository.findById(id).orElse(null);
    }
    @GetMapping("/searchbyTitle")
    public List<Book> getBooksByTitle(@RequestParam String title){
        return bookRepository.findBooksByTitle(title);
    }
    @PostMapping
    public Book createBook(@RequestBody Book book){
       return bookRepository.save(book);
    }
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Integer id,@RequestBody Book bookDetails){
        Book book = bookRepository.findById(id).orElse(null);
        if(book==null){
            return null;
        }
        book.setTitle(bookDetails.getTitle());
        book.setQuantity(bookDetails.getQuantity());
        book.setAuthor(bookDetails.getAuthor());
        return bookRepository.save(book);
    }
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Integer id){
        bookRepository.deleteById(id);
        return "Deleted Success";
    }
}
