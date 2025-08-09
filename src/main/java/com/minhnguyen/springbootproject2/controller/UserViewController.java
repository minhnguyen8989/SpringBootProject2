package com.minhnguyen.springbootproject2.controller;


import com.minhnguyen.springbootproject2.model.User;
import com.minhnguyen.springbootproject2.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserViewController {

    private final UserService userService;

    public UserViewController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("users", userService.getAllUsers());
        return "user-form";  // Matches user-form.html
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute User user) {
        userService.createUser(user);
        return "redirect:/";
    }
}
