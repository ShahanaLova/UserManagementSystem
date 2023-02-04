package az.iktlab.usermanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class UserDto {

    private final String userName;
    private final String name;
    private final String surname;
    private final Gender gender;

}
