package az.iktlab.usermanagementsystem.model;

import lombok.Data;

@Data
public class User {
    private String username;
    private String password;
    private Person person;
}
