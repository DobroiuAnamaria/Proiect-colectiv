package com.example.demo.Controller;

import com.example.demo.Entitites.User;
import com.example.demo.Entitites.UserInfo;
import com.example.demo.Services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@RequestMapping(path = "/api/users/")
@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@RequestAttribute String mail, @RequestAttribute String password,
                        @RequestAttribute String username, @RequestBody UserInfo userInfo){
        String firstName = userInfo.getFirstName();
        String lastName = userInfo.getLastName();
        String dateOfBirth = userInfo.getDateOfBirth();
        String phoneNumber = userInfo.getPhoneNumber();
        userService.addUser(mail,password,username,firstName,lastName,dateOfBirth,phoneNumber);
    }
    @DeleteMapping
    public void deleteUser(@RequestAttribute UUID ID){
        userService.deleteUser(ID);
    }
    @PutMapping
    public void updateUser(@RequestBody User newUser, @RequestAttribute UUID ID){
        userService.updateUser(newUser,ID);
    }
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAll();
    }
}
