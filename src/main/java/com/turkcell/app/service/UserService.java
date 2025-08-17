package com.turkcell.app.service;

import com.turkcell.app.entity.User;
import com.turkcell.app.repository.BaseRepository;
import com.turkcell.app.repository.UserRepository;

import java.util.List;

public class UserService
{
    // Bağımlılık-Dependency Injection
    BaseRepository<User> userRepository;
    public UserService(BaseRepository<User> userRepository) {
        this.userRepository = userRepository;
    }
    // Bu servisi kullanacak sayfa, reposunu kendi seçsin.

    public void save(User user)
    {
        if (user.getEmail().length() < 4)
            return;
        if (!user.getEmail().contains("@"))
            return;
        if (user.getPassword().length() < 4)
            return;

        // repository.
        userRepository.save(user);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }
}
