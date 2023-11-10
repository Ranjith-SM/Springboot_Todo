package com.ranjith.Springboot_Todo.controller;

import com.ranjith.Springboot_Todo.model.AppUser;
import com.ranjith.Springboot_Todo.repository.AppUserRepository;
import com.ranjith.Springboot_Todo.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @PostMapping("/login")
    public AppUser login(@RequestBody AppUser user) {
        return appUserService.login(user);
    }

    @PostMapping("/register")
    public AppUser register(@RequestBody AppUser user) {
        return appUserService.register(user);

    }
}
