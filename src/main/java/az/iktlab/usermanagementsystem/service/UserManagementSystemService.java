package az.iktlab.usermanagementsystem.service;


import az.iktlab.usermanagementsystem.model.User;
import az.iktlab.usermanagementsystem.repository.userManagementSystemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/user")
public class UserManagementSystemService {

    private static final userManagementSystemRepository userRepo = new userManagementSystemRepository();

    //private static final List<Person> p = new ArrayList<>();
    //private static final User user = new User();
    //private static final Person person = new Person();

    @GetMapping
    public List<User> getUsers() {
        return userRepo.allUsers();
    }

    @GetMapping("/id/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userRepo.allUsers().stream()
                .filter(u -> u.getId() == id)
                .findAny()
                .orElseThrow(() -> {
                    throw new RuntimeException("User not found");
                });
    }

    @GetMapping("/fin")
    public User getUserByFin(@RequestParam("fin") String fin) {
        return userRepo.allUsers().stream()
                .filter(u -> Objects.equals(u.getPerson().getFin(), fin))
                .findAny()
                .orElseThrow(() -> {
                    throw new RuntimeException("User not found");
                });
    }


    @PostMapping("/save")
    public void saveUser(@RequestBody User us) {
        userRepo.allUsers().add(us);
    }

    @DeleteMapping("/id")
    public void deleteById(@RequestParam("id") Long id) {
        userRepo.allUsers().removeIf(u -> Objects.equals(u.getId(), id));
    }

    @DeleteMapping
    public void deleteAllUsers() {
        userRepo.allUsers().clear();
    }


}

