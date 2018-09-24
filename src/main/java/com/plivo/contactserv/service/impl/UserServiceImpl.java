package com.plivo.contactserv.service.impl;

import com.plivo.contactserv.repositories.UserRepository;
import com.plivo.contactserv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


}
