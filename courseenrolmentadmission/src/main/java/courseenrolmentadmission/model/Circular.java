package courseenrolmentadmission.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="circular")
public class Circular {
	

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "id")
		private int id;
		
		
		@Column(name = "faculty_name")
		private String facultyName;
		
		
		@NotNull
		@Column(name = "courses")
		private String courses;
		
		
		@Column(name = "description")
		private String description;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFacultyName() {
			return facultyName;
		}

		public void setFacultyName(String facultyName) {
			this.facultyName = facultyName;
		}

		
		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}		
		public String getCourses() {
			return courses;
		}
		public void setCourses(String courses) {
			this.courses = courses;
		}
		
		public Circular() {
			
		}
		
		public Circular(String facultyName, String courses, String description) {
			super();
			this.facultyName = facultyName;
			this.courses = courses;
			this.description = description;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", facultyName=" + facultyName + ",  courses="
					+ courses + ",  description=" + description+ "]";
		}
		
}
