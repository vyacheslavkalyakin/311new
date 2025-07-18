package com.example.kalyakin.ProjectBoot311.controller;


import com.example.kalyakin.ProjectBoot311.model.User;
import com.example.kalyakin.ProjectBoot311.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "index";
    }

    @PostMapping("/add")
    public String addUser(@RequestParam String username, @RequestParam String password,
                          @RequestParam String email) {
        User user = new User(username, password, email);
        userService.addUser(user);
        return "redirect:/users";
    }

    @PostMapping("/delete")
    public String deleteUser(@RequestParam int id) {
        userService.deleteUser( id);
        return "redirect:/users";
    }

    @PostMapping("/edit")
    public String editUser(@RequestParam int id, @RequestParam String username,
                           @RequestParam String password, @RequestParam String email) {
        User user = userService.getUserById( id);
        return "redirect:/users";
    }
}