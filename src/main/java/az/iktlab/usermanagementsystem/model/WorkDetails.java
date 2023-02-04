package az.iktlab.usermanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkDetails {
    private Long workDetailsId;
    private String company;
    private String salary;
    private String position;
}
