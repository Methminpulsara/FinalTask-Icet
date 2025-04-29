package edu.icet.ecom.Service;

import edu.icet.ecom.Dto.Employee;
import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);
    Employee update (Long employeeId, Employee employee);
    void delete (Long employeeId);
    Employee search(String name);
    List<Employee> getAll();


}
