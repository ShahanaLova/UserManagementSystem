package az.iktlab.usermanagementsystem.entity;

import az.iktlab.usermanagementsystem.model.Gender;
import az.iktlab.usermanagementsystem.model.MaritalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="person")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "person_id")
    private  long id;
    @Column(name = "name")
    private String name;
    @Column(name="surname")
    private String surname;
    @Column(name="gender")
    private Gender gender;
    @Column(name="marital_status")
    private MaritalStatus maritalStatus;


}
