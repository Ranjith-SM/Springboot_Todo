package com.ranjith.Springboot_Todo.service;

import com.ranjith.Springboot_Todo.model.AppUser;
import com.ranjith.Springboot_Todo.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;
    public AppUser login(AppUser user) {

        AppUser loggeduser = appUserRepository.findUserById(user.getUsername(),user.getPassword());
        return loggeduser;
    }

    public AppUser register(AppUser user) {
        appUserRepository.save(user);
        return  user;
    }
}
