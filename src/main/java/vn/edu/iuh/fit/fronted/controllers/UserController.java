package vn.edu.iuh.fit.fronted.controllers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.backend.models.User;
import vn.edu.iuh.fit.backend.repositories.UserRepository;
import vn.edu.iuh.fit.backend.services.UserService;

@Controller
@RequestMapping("/users")
@NoArgsConstructor @AllArgsConstructor
public class UserController {
    private UserRepository userRepository;
    private UserService userService;

    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") String id){
        return "";
    }

    @GetMapping("/add-form")
    public String show(@ModelAttribute User user, Model model){
        user =new User();
        model.addAttribute("user",user);
        return "user/add-form";
    }
    public String add(@ModelAttribute User user, Model model){
        userRepository.save(user);
        return "/";
    }
    @GetMapping("/show-login-page")
    public String show_login(@ModelAttribute User user, Model model){
        model.addAttribute("user", new User());
        return "users/login";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute User user, Model model){
        User us = userService.login(user.getEmail(),user.getPasswordHash());
        return "index";
    }
}