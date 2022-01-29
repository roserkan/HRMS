package fastware.hrms.dataAccess.abstracts;

import fastware.hrms.entities.concretes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
}

