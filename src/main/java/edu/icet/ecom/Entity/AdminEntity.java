package edu.icet.ecom.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "admin")

public class AdminEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;
    private String email;
    private String password;
    private String size;
}
