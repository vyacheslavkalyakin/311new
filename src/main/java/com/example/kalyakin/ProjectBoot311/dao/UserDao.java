package com.example.kalyakin.ProjectBoot311.dao;

import com.example.kalyakin.ProjectBoot311.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
    User getUserById(int id);
}
