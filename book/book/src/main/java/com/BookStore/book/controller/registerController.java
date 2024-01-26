package com.BookStore.book.controller;

import com.BookStore.book.entity.UserRegister;
import com.BookStore.book.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class registerController {
    @Autowired
    private RegisterService registerService;

    @PostMapping("/save")
    public ResponseEntity<UserRegister> createUser(@RequestBody UserRegister user){
        UserRegister savedBook = registerService.createUser(user);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

}
