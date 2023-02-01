package az.iktlab.usermanagementsystem.service;


import az.iktlab.usermanagementsystem.model.User;
import az.iktlab.usermanagementsystem.repository.userManagementSystemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;


public class UserManagementSystemService {

    private static final userManagementSystemRepository userRepo = new userManagementSystemRepository();

    public  List<User> getUsers() {
        return userRepo.allUsers();
    }


    public User getUserById( Long id) {
        return userRepo.allUsers().stream()
                .filter(u -> Objects.equals(u.getId(), id))
                .findAny()
                .orElseThrow(() -> {
                    throw new RuntimeException("User not found");
                });
    }


    public User getUserByFin(@RequestParam("fin") String fin) {
        return userRepo.allUsers().stream()
                .filter(u -> Objects.equals(u.getPerson().getFin(), fin))
                .findAny()
                .orElseThrow(() -> {
                    throw new RuntimeException("User not found");
                });
    }


    public void saveUser(User us) {
        userRepo.allUsers().add(us);
    }


    public void deleteById(Long id) {
        userRepo.allUsers().removeIf(u -> Objects.equals(u.getId(), id));
    }


    public void deleteAllUsers() {
        userRepo.allUsers().clear();
    }


}

