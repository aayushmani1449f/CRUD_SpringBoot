package com.magicsoftware.crud.controller;

import com.magicsoftware.crud.entity.User;
import com.magicsoftware.crud.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public String registerUserController(@RequestBody User user){

        return userService.registerUser(user);

    }

    //http://localhost:8080/readUser/1005

    @GetMapping("/readUser/{userId}")
    public User readUserController(@PathVariable(name = "userId") Long Id){
        return userService.readUser(Id);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable Long userId) {
        return userService.deleteUser(userId);
    }

    @PutMapping("/updateUser/{userId}")
    public User updateUserController(
            @PathVariable Long userId,
            @RequestBody User user) {
        return userService.updateUser(userId, user);
    }

    @PatchMapping("/updateUser/{userId}")
    public User updateUsernameController(
            @PathVariable Long userId,
            @RequestBody String username
    ) {
        return userService.updateUsername(userId, username);
    }
}