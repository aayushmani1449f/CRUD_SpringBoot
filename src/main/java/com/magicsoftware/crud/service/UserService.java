package com.magicsoftware.crud.service;

import com.magicsoftware.crud.entity.User;
import com.magicsoftware.crud.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    /**
     *
     * @param user JSON format in postman i give
     * {
     *             "id" : 1001,
     *             "username" : "aayush mani",
     *             "email" : "aayush@gmail.com",
     *             "age" : 22,
     *             "gender" : "male"
     * }
     * @return
     */
    public String registerUser(User user){
        user.setUsername(user.getUsername()); // user.setUsername(aayush mani);
        user.setUserId(user.getUserId());
        user.setEmail(user.getEmail());
        user.setAge(user.getAge());
        user.setGender(user.getGender());

        userRepository.save(user);


        return "Registered Successfully!";
    }


    public User readUser(Long userId){
        return userRepository.findById(userId).orElse(null);
    }

    public String deleteUser(Long userId) {
        userRepository.deleteById(userId);
        return "Deleted User : "+userId;
    }

    public User updateUser(Long userId, User user){

        User existingUser = userRepository.findById(userId).orElse(null);

        if(user == null){
            return null;
        } else {
            existingUser.setAge(user.getAge());
            existingUser.setUsername(user.getUsername()); // user.setUsername(aayush mani);
            existingUser.setEmail(user.getEmail());
            existingUser.setGender(user.getGender());
        }

        return userRepository.save(existingUser);
    }

    public User updateUsername(Long userId,
                        String username) {
        User userUsername = userRepository.findById(userId).orElse(null);
        userUsername.setUsername(username);
        return userRepository.save(userUsername);
    }



}
