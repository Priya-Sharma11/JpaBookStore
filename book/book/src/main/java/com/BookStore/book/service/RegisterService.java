package com.BookStore.book.service;

import com.BookStore.book.entity.UserRegister;

public interface RegisterService {
    UserRegister createUser(UserRegister user);
}
