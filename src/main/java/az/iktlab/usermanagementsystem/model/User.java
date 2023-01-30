package az.iktlab.usermanagementsystem.model;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private Person person;
}
