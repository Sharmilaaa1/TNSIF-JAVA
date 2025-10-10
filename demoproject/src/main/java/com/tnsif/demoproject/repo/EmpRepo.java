package com.tnsif.demoproject.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.demoproject.model.Employee;
public interface EmpRepo extends JpaRepository<Employee ,Integer> {
}