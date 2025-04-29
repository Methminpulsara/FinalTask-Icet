package edu.icet.ecom.Repository;

import edu.icet.ecom.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

    EmployeeEntity findByName(String name);
}
