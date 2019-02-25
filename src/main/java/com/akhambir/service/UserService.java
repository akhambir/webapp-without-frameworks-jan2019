package com.akhambir.service;

import com.akhambir.model.User;

import javax.servlet.http.Cookie;
import java.util.Optional;

public interface UserService {

    Optional<User> authorize(User user);

    Optional<User> addUser(User user);

    Optional<User> findByToken(String token);
}
