package com.example.kalyakin.ProjectBoot311.service;

import com.example.kalyakin.ProjectBoot311.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
    User getUserById(int id);
    void editUser(int id, String username, String password, String email);
}