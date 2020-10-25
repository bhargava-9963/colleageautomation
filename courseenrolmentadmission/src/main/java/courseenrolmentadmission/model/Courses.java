package courseenrolmentadmission.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="courses_form")
public class Courses{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "course_id")
	private int courseid;
	@NotNull
	@Column
	private String courseName;
	@NotNull
	@Column
	private String facultyName;
	
	public Courses() {
	
	}
	
	
	public Courses(String courseName, String facultyName) {
		super();
		this.courseName = courseName;
		this.facultyName = facultyName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	@Override
	public String toString() {
		return "Courses [courseid=" + courseid + ", courseName=" + courseName + ", facultyName=" + facultyName + "]";
	}
	
	
	
	
	
	

}
