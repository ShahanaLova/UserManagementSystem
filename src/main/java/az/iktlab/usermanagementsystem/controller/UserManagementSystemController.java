package az.iktlab.usermanagementsystem.controller;

import az.iktlab.usermanagementsystem.model.Person;
import az.iktlab.usermanagementsystem.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/user")
public class UserManagementSystemController {

    private static final List<User> user = new ArrayList<>();
    private static final List<Person> p = new ArrayList<>();

    @GetMapping
    public List<User> getHello() {
        return user;
    }

    @PostMapping("/save")
    public void saveUser(@RequestBody User us) {
       user.add(us);
    }

    @DeleteMapping("/id")
    public void deleteById(@RequestParam("id") Long id){
        user.removeIf(u-> Objects.equals(u.getId(), id));
    }

}
