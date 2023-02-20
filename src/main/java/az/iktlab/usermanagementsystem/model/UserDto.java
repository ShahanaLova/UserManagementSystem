package az.iktlab.usermanagementsystem.model;

import az.iktlab.usermanagementsystem.entity.PersonEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
public class UserDto implements Serializable {

    private final Long id;
    private final String username;
    private final String password;
    private final Gender gender;
    private final PersonEntity person;


}
