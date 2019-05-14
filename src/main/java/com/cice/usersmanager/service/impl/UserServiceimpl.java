package com.cice.usersmanager.service.impl;

import com.cice.usersmanager.controller.dto.UserDTO;
import com.cice.usersmanager.repository.UserRepository;
import com.cice.usersmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public Long searchUserByPassword(UserDTO userDTO) {
        userRepository.searchUserByLogin(userDTO.getUser(), userDTO.getPassword());
        return null;
    }
}
