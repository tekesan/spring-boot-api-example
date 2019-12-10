package com.digimaster.services;

import com.digimaster.entities.User;
import com.digimaster.exceptions.UserExistsException;
import com.digimaster.exceptions.UserNotFoundException;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllUsers();
    User createUser(User user) throws UserExistsException;
    Optional<User> getUserById(Long id)  throws UserNotFoundException;
    User updateUserById(Long id, User user)  throws UserNotFoundException ;
    void deleteUserById(Long id);
    User getUserByUsername(String username);

}
