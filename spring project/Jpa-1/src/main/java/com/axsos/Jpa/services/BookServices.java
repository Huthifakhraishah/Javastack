package com.axsos.Jpa.services;

import java.util.Optional;
import java.util.List;

import org.springframework.stereotype.Service;

import com.axsos.Jpa.models.Book;
import com.axsos.Jpa.repositories.BookRepository;

@Service
public class BookServices {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookServices(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
}