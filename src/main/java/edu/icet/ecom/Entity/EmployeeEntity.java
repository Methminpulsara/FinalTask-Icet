package edu.icet.ecom.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table( name = "employee")

public class EmployeeEntity {

    @Id
    @GeneratedValue
    private Long employeeId;

    private String name;
    private String email;
    private String department;
    private String createdDate;
    private String modifiedDate;

}
