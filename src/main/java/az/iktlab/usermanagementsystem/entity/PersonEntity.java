package az.iktlab.usermanagementsystem.entity;

import az.iktlab.usermanagementsystem.model.Gender;
import az.iktlab.usermanagementsystem.model.MaritalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="person")
public class PersonEntity {
    @Id
    private  long id;
    private String name;
    private String surname;
    private Gender gender;
    private MaritalStatus maritalStatus;


}
