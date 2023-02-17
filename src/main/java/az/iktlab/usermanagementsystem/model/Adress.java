package az.iktlab.usermanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Adress {
    private Long adressIid;
    private String city;
    private String region;
    private String zipCode;

}
