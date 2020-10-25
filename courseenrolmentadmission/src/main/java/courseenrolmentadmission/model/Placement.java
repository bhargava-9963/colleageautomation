package courseenrolmentadmission.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="placement")
public class Placement{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="companyname")
	private String companyName;
	
	@NotEmpty
	@Column(name="salary")
	private String salary;
	
	@NotEmpty
	@Column(name="cgpa")
	private String cgpa;
	
	@NotEmpty
	@NotNull
	@Column(name="branch")
	private String branch;
	
	@NotEmpty
	@Column(name="registerlink")
	private String registerLink;
	

	
	public Placement() {
	}
	
	public Placement(String companyName, String salary, String cgpa, String branch, String registerLink) {
		super();
		this.companyName = companyName;
		this.salary = salary;
		this.cgpa = cgpa;
		this.branch = branch;
		this.registerLink = registerLink;
	}

	public String getRegisterLink() {
		return registerLink;
	}

	public void setRegisterLink(String registerLink) {
		this.registerLink = registerLink;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getCgpa() {
		return cgpa;
	}

	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}

}
