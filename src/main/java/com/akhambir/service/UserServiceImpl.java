package com.akhambir.service;

import com.akhambir.model.User;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Override
    public Optional<User> authorize(User user) {
        user.setFirstName("Anton");
        return Optional.empty();
    }
}
