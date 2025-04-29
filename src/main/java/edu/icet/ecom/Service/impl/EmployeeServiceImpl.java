package edu.icet.ecom.Service.impl;

import edu.icet.ecom.Dto.Employee;
import edu.icet.ecom.Entity.EmployeeEntity;
import edu.icet.ecom.Repository.EmployeeRepository;
import edu.icet.ecom.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final ModelMapper mapper;
    private final EmployeeRepository repository;



    @Override
    public Employee save(Employee employee) {
        EmployeeEntity entity = mapper.map(employee,EmployeeEntity.class);
        entity = repository.save(entity);
        return mapper.map(entity,Employee.class);
    }

    @Override
    public Employee update(Long employeeId, Employee employee) {

        EmployeeEntity entity = repository.findById(employeeId)
                .orElseThrow(()-> new RuntimeException("employee not found"));

        entity.setName(employee.getName());
        entity.setEmail(employee.getEmail());
        entity.setDepartment(employee.getDepartment());
        entity.setModifiedDate(employee.getModifiedDate());

        repository.save(entity);

        EmployeeEntity  updatedEmployeeEntity= repository.findById(employeeId)
                .orElseThrow(()-> new RuntimeException("Employee not found after update"));

        return mapper.map(updatedEmployeeEntity,Employee.class);

    }

    @Override
    public void delete(Long employeeId) {
        repository.deleteById(employeeId);
    }

    @Override
    public List<Employee> getAll( ) {
        List<Employee> employeeList = new ArrayList<>();
        List<EmployeeEntity> all = repository.findAll();
        all.forEach(employeeEntity -> {
            employeeList.add(mapper.map(employeeEntity,Employee.class));
        });
        return employeeList;
    }

    @Override
    public Employee search(String name) {
        return mapper.map(repository.findByName(name),Employee.class);
    }
}
