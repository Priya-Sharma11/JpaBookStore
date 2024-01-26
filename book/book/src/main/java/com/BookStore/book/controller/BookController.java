package com.BookStore.book.controller;

import com.BookStore.book.entity.Book;
import com.BookStore.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/books/")
@CrossOrigin("http://localhost:3000/")
public class BookController {

    @Autowired
    private BookService bookService;
    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        Book savedBook = bookService.createBook(book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Book> getBookByID(@PathVariable("id") int bookId){
        Book book = bookService.getBookById(bookId);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBook(){
        List<Book> bookList = bookService.getAllBook();
        return new ResponseEntity<>(bookList, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Book> updateBook(@PathVariable("id") int bookID, @RequestBody Book book){
        book.setId(bookID);
        Book updateBook  = bookService.updateBook(book);
        return new ResponseEntity<>(updateBook,HttpStatus.OK);

    }

    @DeleteMapping("{id}")
    public ResponseEntity<String>deleteBook(@PathVariable("id") int bookId){
        bookService.deleteBook(bookId);
        return new ResponseEntity<>("Book was Deleted successfully ", HttpStatus.OK);
    }
}
