package az.iktlab.usermanagementsystem.controller;

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
    public void save(@RequestBody UserDto userDto){
      userService.save(userDto);
    }
    @GetMapping
    public List<UserDto> getAll(){return userService.getAll();}

    @DeleteMapping({"/id/{id}"})
    public void deleteById(@PathVariable Long id){

        userService.deleteById(id);
    }

    @DeleteMapping
    public void deleteALlUsers(){
        userService.deleteAllUsers();
    }

}
