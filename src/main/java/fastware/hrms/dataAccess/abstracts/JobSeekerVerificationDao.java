package fastware.hrms.dataAccess.abstracts;

import fastware.hrms.entities.concretes.JobSeekerVerification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerVerificationDao extends JpaRepository<JobSeekerVerification, Integer> {
}