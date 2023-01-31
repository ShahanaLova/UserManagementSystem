package az.iktlab.usermanagementsystem.repository;

import az.iktlab.usermanagementsystem.model.User;

import java.util.ArrayList;
import java.util.List;

public class userManagementSystemRepository {
    private static final List<User> users = new ArrayList<>();

    public void save(User user){
        users.add(user);
    }
    public List<User> allUsers(){
        return users;
    }
}
