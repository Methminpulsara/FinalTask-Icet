package edu.icet.ecom.Service;

import edu.icet.ecom.Dto.AdminDto;

public interface AdminService {

    AdminDto add (AdminDto adminDto);

    AdminDto login(String email,String password);

}
