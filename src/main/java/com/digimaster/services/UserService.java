package com.digimaster.services;

import com.digimaster.entities.User;

import java.util.Optional;

public interface UserService {

    User createUser(User user);
    Optional<User> getUserById(Long id);
    User updateUserById(Long id, User user);
    void deleteUserById(Long id);
    User getUserByUsername(String username);

}
