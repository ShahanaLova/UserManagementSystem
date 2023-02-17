package az.iktlab.usermanagementsystem.model;

import az.iktlab.usermanagementsystem.entity.Education;
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
    private Adress adress;
    private Education education;
     private WorkDetails workDetails;

}
