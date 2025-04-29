package edu.icet.ecom.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDto {

    private Long adminId;
    private String adminEmail;
    private String password;
    private String size;
}
