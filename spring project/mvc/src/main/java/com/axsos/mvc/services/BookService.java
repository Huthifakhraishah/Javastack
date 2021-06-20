package com.axsos.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.mvc.models.Book;
import com.axsos.mvc.repository.BookRepository;
@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
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
    public Book updateBook(Long id,String title,String desc,String lang,int numOfPages) {
        Optional<Book> newBook = bookRepository.findById(id);
        if(newBook.isPresent()) {
        	newBook.get().setTitle(title);
        	newBook.get().setDescription(desc);
        	newBook.get().setLanguage(lang);
        	newBook.get().setNumberOfPages(numOfPages);
        	return createBook(newBook.get());
        } else {
            return null;
        }
    	
    }
    public void deleteBook(Long id) {
    	Optional<Book> optionalBook = bookRepository.findById(id);
    	if(optionalBook.isPresent()) {
    		bookRepository.deleteById(id);
    	}
    }
}
