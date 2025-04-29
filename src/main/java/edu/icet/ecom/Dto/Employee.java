package edu.icet.ecom.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
    private Long employeeId;
    private String name;
    private String email;
    private String department;
    private String createdDate;
    private String modifiedDate;

}
