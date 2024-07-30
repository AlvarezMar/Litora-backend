package com.alvarezmar.litora.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvarezmar.litora.models.User;
import com.alvarezmar.litora.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> findById(UUID id) {
        return userRepository.findById(id);
    }
}
