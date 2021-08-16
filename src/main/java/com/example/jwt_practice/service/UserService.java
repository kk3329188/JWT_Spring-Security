package com.example.jwt_practice.service;

import com.example.jwt_practice.domain.Role;
import com.example.jwt_practice.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);
    User getUser(String username);
    List<User> getUsers();
}
