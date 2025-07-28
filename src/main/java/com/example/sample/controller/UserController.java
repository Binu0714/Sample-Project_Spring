package com.example.sample.controller;

import com.example.sample.dto.UserDTO;
import com.example.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("get")
    public List<UserDTO> getUser() {
        return userService.getAllUser();
    }

    @PostMapping("save")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @PutMapping("update")
    public UserDTO updateUser(@RequestBody UserDTO userDTO) {
        return userService.updateUSer(userDTO);
    }

    @DeleteMapping("delete")
    public boolean deleteUser(@RequestBody UserDTO userDTO) {
        return userService.deleteUser(userDTO);
    }
}
