package edu.icet.ecom.Service.impl;

import edu.icet.ecom.Dto.AdminDto;
import edu.icet.ecom.Entity.AdminEntity;
import edu.icet.ecom.Repository.AdminRepository;
import edu.icet.ecom.Service.AdminService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class AdminServiceImpl implements AdminService {

    private final AdminRepository repository;
    private final ModelMapper mapper;

    @Override
    public AdminDto add(AdminDto adminDto) {
        AdminEntity entity = mapper.map(adminDto,AdminEntity.class);
        entity=repository.save(entity);
        return mapper.map(entity,AdminDto.class);
    }

    @Override
    public AdminDto login(String email, String password){
        AdminEntity entity = repository.findByEmailAndPassword(email,password);
        if(entity==null){
            return null;
        }
        return mapper.map(entity,AdminDto.class);
    }


}
