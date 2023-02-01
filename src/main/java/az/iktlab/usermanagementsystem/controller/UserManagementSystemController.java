package az.iktlab.usermanagementsystem.controller;


import az.iktlab.usermanagementsystem.model.User;
import az.iktlab.usermanagementsystem.service.UserManagementSystemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserManagementSystemController {

    private final UserManagementSystemService userService = new UserManagementSystemService();

    @PostMapping("/save")
    public void save(@RequestBody User user) {
         userService.saveUser(user);
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/id/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }
    @GetMapping("/fin")
    public User getUserByFin(@RequestParam("fin") String fin){
        return userService.getUserByFin( fin);
    }
    @DeleteMapping("/id")
    public void deleteUserById(@RequestParam("id") Long id){
        userService.deleteById(id);
    }
    @DeleteMapping
    public void deleteAllUsers() {
        userService.deleteAllUsers();
    }
}
