package edu.icet.ecom.Repository;

import edu.icet.ecom.Entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository <AdminEntity,Long> {
    AdminEntity findByEmailAndPassword(String email, String password);
}
