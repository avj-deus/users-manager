package com.cice.usersmanager.controller;


import com.cice.usersmanager.controller.dto.UserDTO;
import com.cice.usersmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersResources {
    @Autowired
    UserService userService;

    @RequestMapping(path = "/user/login", method = RequestMethod.POST)
    public ResponseEntity<Long> login(@RequestBody UserDTO user){
        ResponseEntity<Long> responseDTO = null;
        Long userId = userService.searchUserByPassword(user);
        if(userId != null) {
            responseDTO = ResponseEntity.ok(userId);
        }else{
            responseDTO = ResponseEntity.notFound().build();
        }
        return responseDTO;
    }
}
