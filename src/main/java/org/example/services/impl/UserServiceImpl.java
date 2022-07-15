package org.example.services.impl;

import org.example.entity.User;
import org.example.repository.UserRepository;
import org.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(UUID id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void saveAll(List<User> userList) {
        userRepository.saveAll(userList);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

}
