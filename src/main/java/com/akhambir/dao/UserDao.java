package com.akhambir.dao;

import com.akhambir.model.User;

public interface UserDao {

    User addUser(User user);

    User getByToken(String token);

}
