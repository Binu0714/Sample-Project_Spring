package com.example.sample.service;

import com.example.sample.dto.UserDTO;
import com.example.sample.entity.User;
import com.example.sample.repository.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public List<UserDTO> getAllUser() {
        List<User> users = userRepo.findAll();
        return modelMapper.map(users, new TypeToken<List<UserDTO>>(){}.getType());
    }
}
