package com.dev.estudodev.controller;

import com.dev.estudodev.domain.users.User;
import com.dev.estudodev.dto.UserDto;
import com.dev.estudodev.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    private UserServices userServices;
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserDto userDto){
        User newUser = userServices.createUser(userDto);
        return  new ResponseEntity<>(newUser, HttpStatus.CREATED);

    }
    @GetMapping
    public ResponseEntity<List<User>>getAllUsers(){
        List<User> users= this.userServices.getAllUsers();
        return  new ResponseEntity<>(users,HttpStatus.OK);
    }
}
