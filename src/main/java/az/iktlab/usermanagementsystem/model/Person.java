package az.iktlab.usermanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private long id;
    private String name;
    private String surname;
    private String patronymicName;
    private String fin;
    private Gender gender;
    private LocalDate birthDay;
    private MaritalStatus maritalStatus;
    private Nationality nationality;
    private Long adressId;
    private Education education;
     private Long workDetailsId;

}
