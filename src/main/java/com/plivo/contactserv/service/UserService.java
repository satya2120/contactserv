package com.plivo.contactserv.service;

import com.plivo.contactserv.dto.UserRequest;
import com.plivo.contactserv.entity.User;

import java.util.List;

public interface UserService {
    User createUser(UserRequest userRequest);

    List<User> getUsers();

    User getUserById(int id);
}
