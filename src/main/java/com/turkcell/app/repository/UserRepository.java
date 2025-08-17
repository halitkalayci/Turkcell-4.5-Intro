package com.turkcell.app.repository;

import com.turkcell.app.entity.User;

import java.util.ArrayList;
import java.util.List;


// UserDal, UserDao
public class UserRepository implements BaseRepository<User>
{
    // In-Memory
    List<User> users = new ArrayList<>();

    @Override
    public List<User> findAll() {
        return users;
    }
    @Override
    public User findById(int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }
    @Override
    public void save(User user) {
        users.add(user);
        System.out.println("User saved");
    }
    @Override
    public void delete(User user) {

    }
}
