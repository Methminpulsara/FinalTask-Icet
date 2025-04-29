package edu.icet.ecom.Service.impl;

import edu.icet.ecom.Dto.AdminDto;
import edu.icet.ecom.Repository.AdminRepository;
import edu.icet.ecom.Service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class AdminServiceImpl implements AdminService {

    private final AdminRepository repository;

    @Override
    public AdminDto add(AdminDto adminDto) {
        return null;
    }
}
