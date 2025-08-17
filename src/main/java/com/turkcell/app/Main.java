package com.turkcell.app;

import com.turkcell.app.entity.User;
import com.turkcell.app.repository.UserRepository;
import com.turkcell.app.service.UserService;

import java.util.List;
// Presentation

// SOLID => Dependecy Inversion Principle
public class Main {
    public static void main(String[] args) {
        // Genel veritabanı.

        // Presentation -> Service -> Entity & Repository
        UserService userService = new UserService(new UserRepository());

        User user = new User();
        user.setId(1);
        user.setEmail("turkcell@gmail.com");
        user.setName("Turkcell");
        user.setPassword("abc1234");

        userService.save(user);
    }
}
