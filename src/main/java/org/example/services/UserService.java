package org.example.services;

import org.example.entity.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);

    List<User> findAll();

    void saveUser(User user);

    void saveAll(List<User> userList);

    void deleteUser(User user);


}
