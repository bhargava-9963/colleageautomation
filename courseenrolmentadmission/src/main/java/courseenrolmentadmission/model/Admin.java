package courseenrolmentadmission.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="admin")
public class Admin  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@NotEmpty
	@Pattern(regexp="[^0-9]+")
	@Size(min=6,max=20)
	@Column(name = "student_name")
	private String fName;
	
	@NotEmpty
	@Column(name = "gender")
	private String gender;
	
	

	@NotEmpty
	
	@Column(name = "email")
	private String femail;
	
	@NotEmpty
	@Column(name = "password")
	private String fpassword;

	public int getId() {
		return id;
	}

	public void setFid(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getFemail() {
		return femail;
	}

	public void setFemail(String femail) {
		this.femail = femail;
	}

	public String getFpassword() {
		return fpassword;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setFpassword(String fpassword) {
		this.fpassword = fpassword;
	}

	public Admin(int id, String fName,  String femail,  String fpassword,String gender) {
		
		this.id = id;
		this.fName = fName;
		this.femail = femail;
		this.fpassword = fpassword;
		this.gender = gender;
	}

	public Admin() {
		
	}
	@Override
	public String toString() {
		return "FacultyRegister [id=" + id + ", fName=" + fName + ", gender=" + gender + ", femail=" + femail
				+ ", fpassword=" + fpassword + "]";
	}
	


}
