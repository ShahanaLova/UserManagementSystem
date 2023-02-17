package az.iktlab.usermanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Work")
public class WorkEntity {
    @Id
    @Column(name = "work_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workDetailsId;
    @Column(name = "company")
    private String company;
    @Column(name = "salary")
    private String salary;
    @Column(name="position")
    private String position;
}
