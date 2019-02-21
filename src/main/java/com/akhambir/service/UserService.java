package com.akhambir.service;

import com.akhambir.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> authorize(User user);

}
