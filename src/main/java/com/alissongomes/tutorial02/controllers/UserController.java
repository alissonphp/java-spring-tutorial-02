package com.alissongomes.tutorial02.controllers;

import com.alissongomes.tutorial02.models.User;
import com.alissongomes.tutorial02.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping()
    public @ResponseBody String store(@RequestParam String name, @RequestParam String email) {
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        userRepository.save(user);

        return "new user stored";
    }

    @GetMapping()
    public @ResponseBody Iterable<User> list() {
        return userRepository.findAll();
    }
}
