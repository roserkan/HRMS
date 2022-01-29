package fastware.hrms.dataAccess.abstracts;

import fastware.hrms.entities.concretes.EmployerVerification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerVerificationDao extends JpaRepository<EmployerVerification, Integer> {
}
