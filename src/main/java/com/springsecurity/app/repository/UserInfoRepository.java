package com.springsecurity.app.repository;

import com.springsecurity.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<User, Integer> {
    public Optional<User> findByUsername(String username);
}
