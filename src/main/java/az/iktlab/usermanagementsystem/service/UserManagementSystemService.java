package az.iktlab.usermanagementsystem.service;


import az.iktlab.usermanagementsystem.model.User;
import az.iktlab.usermanagementsystem.repository.userManagementSystemRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@Service
public class UserManagementSystemService {

    private static final userManagementSystemRepository userRepo = new userManagementSystemRepository();

    public List<User> getUsers() {
        return userRepo.allUsers();
    }


    public User getUserById(Long id) {
        return userRepo.getUserById(id);
    }


//    public User getUserByFin(String fin) {
//        return userRepo.getUserByFin(fin);
//    }


    public void saveUser(User us) {
        userRepo.save(us);
    }


    public void deleteById(Long id) {
        userRepo.deleteById(id);
    }


    public void deleteAllUsers() {
        userRepo.deleteAllUsers();
    }


}

