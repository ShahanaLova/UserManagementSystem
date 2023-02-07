package az.iktlab.usermanagementsystem.controller;

import az.iktlab.usermanagementsystem.entity.UserEntity;
import az.iktlab.usermanagementsystem.model.UserDto;
import az.iktlab.usermanagementsystem.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void save(@RequestBody UserEntity entity){
      userService.save(entity);
    }
    @GetMapping
    public List<UserDto> getAll(){return userService.getAll();}
}
