package edu.icet.ecom.Controller;

import edu.icet.ecom.Dto.Employee;
import edu.icet.ecom.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employee")
@CrossOrigin
@RequiredArgsConstructor

public class EmployeeController {

    private final EmployeeService service;

    @PostMapping("/add")
    public Employee add(@RequestBody Employee employee){
        employee.setEmployeeId(null);
        return service.save(employee);
    }
    @PutMapping("/update/{id}")
    public Employee update(@PathVariable Long id , @RequestBody Employee employee){
        return service.update(id, employee);
    }
    @GetMapping("/search/{name}")
    public Employee search(@PathVariable String name){
        return service.search(name);
    }

    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping("/all")
    List<Employee> getAll (){
        return service.getAll();
    }


}
