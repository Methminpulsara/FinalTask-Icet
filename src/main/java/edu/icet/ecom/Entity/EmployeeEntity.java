package edu.icet.ecom.Entity;

import jakarta.persistence.*;
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

    @Column(nullable = false , length = 100)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String department;

    @Column(nullable = false)
    private String createdDate;

    @Column(nullable = false)
    private String modifiedDate;

}
