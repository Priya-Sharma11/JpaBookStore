package com.BookStore.book.service;

import com.BookStore.book.entity.UserRegister;
import com.BookStore.book.Repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterImplementation implements RegisterService {
    @Autowired
    private RegisterRepository registerRepo;

    @Override
    public UserRegister createUser(UserRegister user) {
        return registerRepo.save(user);
    }
}
