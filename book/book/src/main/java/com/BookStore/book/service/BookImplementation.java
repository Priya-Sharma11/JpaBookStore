package com.BookStore.book.service;

import com.BookStore.book.Repository.BookRepository;
import com.BookStore.book.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookImplementation implements BookService{
    @Autowired
    private BookRepository bookRepository;

    public Book createBook(Book book){
        return bookRepository.save(book);
    }

    public Book getBookById(int bookId){
        Optional<Book> optionalBook = bookRepository.findById(bookId);
        return optionalBook.get();
    }

    public List<Book> getAllBook(){
        return  bookRepository.findAll();
    }

    public Book updateBook(Book book){
        Book existingBook = bookRepository.findById(book.getId()).get();
        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setDescription(book.getDescription());
        existingBook.setGenre(book.getGenre());
        Book updateBook=bookRepository.save(existingBook);
        return updateBook;
    }

    public  void deleteBook(int bookId){
        bookRepository.deleteById((int)bookId);
    }

}
