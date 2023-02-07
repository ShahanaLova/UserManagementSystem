package az.iktlab.usermanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class UserDto {

    private final Long id;
    private final String username;
    private final Long personId;
    private final Gender gender;

}
