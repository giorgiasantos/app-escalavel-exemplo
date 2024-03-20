package com.example.usersservice.service;

import com.example.usersservice.model.UserModel;
import com.example.usersservice.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserModel> getAll(){
        return userRepository.findAll();
    }

    public UserModel getUser(Long userId){
        return userRepository.findById(userId).orElseThrow(() -> new RuntimeException("Usuário não encontrado."));
    }

    public UserModel createUser(UserModel userModel){
        return userRepository.save(userModel);
    }

    public void deleteUser(Long userId){
        userRepository.deleteById(userId);
    }

}
