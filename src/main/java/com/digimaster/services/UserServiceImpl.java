package com.digimaster.services;

import com.digimaster.entities.User;
import com.digimaster.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    final private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // getAllUsers Method
    public List<User> getAllUsers() {

        return userRepository.findAll();

    }

    //CreateUser Method
    public User createUser(User user) {
        return userRepository.save(user);
    }

    //getUserById
    public Optional<User> getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);

        return user;
    }


    //updateUserById
    public User updateUserById(Long id, User user) {
        user.setId(id);
        return userRepository.save(user);

    }


    //deleteUserById
    public void deleteUserById(Long id) {
        if(userRepository.findById(id).isPresent()) {
            userRepository.deleteById(id);

        }
    }


    //getUserByUsername

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
