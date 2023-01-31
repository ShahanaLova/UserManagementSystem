package az.iktlab.usermanagementsystem.controller;


import az.iktlab.usermanagementsystem.model.User;
import az.iktlab.usermanagementsystem.service.UserManagementSystemService;

import java.util.List;

public class UserManagementSystemController {

    private final UserManagementSystemService userService = new UserManagementSystemService();

    public void save(User user){
        userService.saveUser(user);
    }

    public List<User> getUsers(){
        return userService.getUsers();
    }


}
