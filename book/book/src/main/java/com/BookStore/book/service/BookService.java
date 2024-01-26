package com.BookStore.book.service;

import com.BookStore.book.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {
    Book createBook(Book book);
    Book getBookById(int bookId);
    List<Book> getAllBook();
    Book updateBook(Book book);
    void deleteBook(int bookId);
}
