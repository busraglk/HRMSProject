package recap.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import recap.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {

}
