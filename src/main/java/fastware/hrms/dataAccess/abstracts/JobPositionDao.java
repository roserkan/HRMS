package fastware.hrms.dataAccess.abstracts;

import fastware.hrms.entities.concretes.JobPositions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionDao extends JpaRepository<JobPositions, Integer> {
}
