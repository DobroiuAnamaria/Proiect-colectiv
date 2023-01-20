package com.example.demo.services;

import com.example.demo.entitites.User;
import com.example.demo.entitites.UserInfo;
import com.example.demo.repositories.UserRepository;
import com.example.demo.repositories.UsersInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class UserService {
    private UserRepository userRepository;
    private UsersInfoRepository usersInfoRepository;

    public UserService(UserRepository userRepository,UsersInfoRepository usersInfoRepository) {
        this.userRepository = userRepository;
        this.usersInfoRepository = usersInfoRepository;
    }

    public void addUser(String email, String password, String username, String firstName, String lastName, String dateOfBirth, String phoneNumber){
        UserInfo userInfo = new UserInfo(firstName,lastName,dateOfBirth,phoneNumber);
        usersInfoRepository.save(userInfo);
        User user = new User(email,password,username,userInfo);
        userRepository.save(user);
    }
    public void deleteUser(UUID ID){
        userRepository.deleteById(ID);
    }
    public void updateUser(User newUser,UUID ID){
        User user = userRepository.findById(ID).orElseThrow();
        user.setUserInfo(newUser.getUserInfo());
        user.setUserName(newUser.getUserName());
        user.setMail(newUser.getMail());
        user.setPassword(newUser.getPassword());
        userRepository.save(user);
    }
    public List<User> getAll(){
        return userRepository.findAll();
    }

}
