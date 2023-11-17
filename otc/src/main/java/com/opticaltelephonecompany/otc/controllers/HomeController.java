package com.opticaltelephonecompany.otc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opticaltelephonecompany.otc.entities.User;
import com.opticaltelephonecompany.otc.services.UserService;

@RestController
public class HomeController {

    @Autowired
    UserService userService;

    @GetMapping("sayhello")
    public String sayHello(){
        return "Hello world";
    }
    
    @GetMapping("getUsers")
    public List<User> getUsers(){
      return userService.getUsers();
    }

}
