package az.iktlab.usermanagementsystem.entity;

import az.iktlab.usermanagementsystem.model.Gender;
import az.iktlab.usermanagementsystem.model.MaritalStatus;
import az.iktlab.usermanagementsystem.model.Nationality;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "person")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "gender")
    private Gender gender;
    @Column(name = "marital_status")
    private MaritalStatus maritalStatus;
    @Column(name = "patronymic_name")
    private String patronymicName;
    @Column(name = "fin")
    private String fin;
    @Column(name = "birth_day")
    private LocalDate birthDay;
    @Column(name = "nationality")
    private Nationality nationality;
    @OneToOne(targetEntity = AdressEntity.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "person_address")
    @JoinColumn(name = "adress_id")
    private AdressEntity adress;
    private Education education;

    @OneToMany(targetEntity = WorkEntity.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "Person_works", joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "work_id"))
    private List<WorkEntity> workDetailsId;

}
