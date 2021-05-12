package recap.hrms.business.abstracts;

import java.util.List;

import recap.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	
	List<JobPosition> getAll();
}
