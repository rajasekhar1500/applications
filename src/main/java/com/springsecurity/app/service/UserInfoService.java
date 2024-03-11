package com.springsecurity.app.service;

import com.springsecurity.app.entity.User;
import com.springsecurity.app.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {
    @Autowired
    private UserInfoRepository userInfoRepository;

    public User saveUser(User user) {
        User savedUser = userInfoRepository.save(user);
        return savedUser;
    }
}
