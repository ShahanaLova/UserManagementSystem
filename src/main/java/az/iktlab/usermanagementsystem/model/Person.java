package az.iktlab.usermanagementsystem.model;

import lombok.Data;

import java.time.LocalDate;
@Data
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

}
