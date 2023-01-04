package com.example.demo.controller;
import com.example.demo.entitites.User;
import com.example.demo.entitites.UserInfo;
import com.example.demo.services.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RequestMapping(path = "/api/users/")
@RestController
@Api(tags = "User controller")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@RequestParam String mail, @RequestParam String password,
                        @RequestParam String username, @RequestBody UserInfo userInfo){
        String firstName = userInfo.getFirstName();
        String lastName = userInfo.getLastName();
        String dateOfBirth = userInfo.getDateOfBirth();
        String phoneNumber = userInfo.getPhoneNumber();
        userService.addUser(mail,password,username,firstName,lastName,dateOfBirth,phoneNumber);
    }
    @DeleteMapping
    public void deleteUser(@RequestParam UUID ID){
        userService.deleteUser(ID);
    }
    @PutMapping
    public void updateUser(@RequestBody User newUser, @RequestParam UUID ID){
        userService.updateUser(newUser,ID);
    }
    @GetMapping
    @ApiOperation(nickname = "getUsers", value = "returns users ")
    public List<User> getAllUsers(){
        return userService.getAll();
    }
}
