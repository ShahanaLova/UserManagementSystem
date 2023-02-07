package az.iktlab.usermanagementsystem.entity;

import az.iktlab.usermanagementsystem.model.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="users")

public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long id;
    @Column(name="username")
    private String username;
    @Column(name= "password")
    private String password;
    @Column(name="personid")
    private Long personId;

    @Column(name="gender")
    private Gender gender;


}
