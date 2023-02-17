package az.iktlab.usermanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="adress")

public class AdressEntity {

    @Id
    @Column(name="address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adressId;
    @Column(name="city")
    private String city;
    @Column(name="region")
    private String region;

    @Column(name="zip_code")
    private String zipCode;
}
