package az.iktlab.usermanagementsystem.repository;

import az.iktlab.usermanagementsystem.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository

public class userManagementSystemRepository {
    private static final List<User> users = new ArrayList<>();

    public void save(User user){
        users.add(user);
    }

    public User getUserById(Long id) {
        return users.stream()
                .filter(u -> Objects.equals(u.getId(), id))
                .findAny()
                .orElseThrow(() -> {
                    throw new RuntimeException("User not found");
                });
    }

    public User getUserByFin(String fin) {
        return users.stream()
                .filter(u -> Objects.equals(u.getPerson().getFin(), fin))
                .findAny()
                .orElseThrow(() -> {
                    throw new RuntimeException("User not found");
                });
    }
    public void deleteById(Long id) {
        users.removeIf(u -> Objects.equals(u.getId(), id));
    }

    public void deleteAllUsers() {
        users.clear();
    }

    public List<User> allUsers(){
        return users;
    }
}
