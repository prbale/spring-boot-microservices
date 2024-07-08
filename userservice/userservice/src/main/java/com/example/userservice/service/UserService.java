package com.example.userservice.service;

import com.example.userservice.model.Users;
import com.example.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Users getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public Users saveUser(Users users) {
        return userRepository.save(users);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

}
