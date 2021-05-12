package recap.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Data
@Entity
@Table(name="job_positions")
//@NoArgsConstructor
//@AllArgsConstructor

public class JobPosition {	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	//@NoArgsConstructor
	public JobPosition() {}

	
	//@AllArgsConstructor
	public JobPosition(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	//@Data
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
