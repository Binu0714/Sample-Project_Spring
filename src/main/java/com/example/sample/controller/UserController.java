package com.example.sample.controller;

import com.example.sample.dto.UserDTO;
import com.example.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("get")
    public String getUser() {
        return "user";
    }

    @PostMapping("save")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @PutMapping("update")
    public String updateUser() {
        return "user";
    }

    @DeleteMapping("delete")
    public String deleteUser() {
        return "user";
    }
}
