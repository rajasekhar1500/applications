package com.springsecurity.app.controller;

import com.springsecurity.app.entity.User;
import com.springsecurity.app.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private PasswordEncoder encoder;
    @PostMapping("/save")
    public String saveUser(@RequestBody User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        userInfoService.saveUser(user);
        return "user saved successfully.";
    }
}
