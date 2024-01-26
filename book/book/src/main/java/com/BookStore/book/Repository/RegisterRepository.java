package com.BookStore.book.Repository;

import com.BookStore.book.entity.UserRegister;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<UserRegister,Long> {
}
