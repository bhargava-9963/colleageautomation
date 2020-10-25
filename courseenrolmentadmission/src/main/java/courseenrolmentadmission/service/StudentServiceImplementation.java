package courseenrolmentadmission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import courseenrolmentadmission.model.Circular;
import courseenrolmentadmission.model.Courses;
import courseenrolmentadmission.model.FacultyRegister;
import courseenrolmentadmission.model.MeetingTime;
import courseenrolmentadmission.dao.Studentdao;
import courseenrolmentadmission.model.Admin;
import courseenrolmentadmission.model.AdminCrediential;
import courseenrolmentadmission.model.Placement;
import courseenrolmentadmission.model.Student;
import courseenrolmentadmission.model.StudentCrediential;

@Service
public class StudentServiceImplementation implements StudentService {
	
	@Autowired
	private Studentdao studentdao;

	
	@Transactional
	public List<Student> getAllStudents() {
		
		return studentdao.getAllStudents();
	}



	@Transactional
	public List<Student> getSearchStudents(String search) {
		
		return studentdao.getSearchStudents(search);
	}



	@Transactional
	public boolean validateAdmin(AdminCrediential admincrediential) {
		
		return studentdao.validateAdmin(admincrediential);
	}



	@Transactional
	public void deleteStudent(Integer employeeid) {
		studentdao.deleteStudent(employeeid);
		
	}



	@Transactional
	public void addPlacement(Placement placement) {
		studentdao.addPlacement(placement);
		
	}



	@Transactional
	public List<Placement> listOfCpmpanies() {
		
		return studentdao.listOfCpmpanies();
	}



	@Transactional
	public boolean validateStudentDetails(StudentCrediential studentcrediential) {
		
		return  studentdao.validateStudentDetails(studentcrediential);
	}
	
	@Transactional
	
	public List<Courses> getAllCourses() {
		
		return studentdao.getAllCourses();
	}
	@Transactional

	public List<Courses> getSearchCourses() {
		
		return studentdao.getSearchCourses();
	}
	@Transactional
	
	public List<Courses> getSearchFaculty() {
		
		return studentdao.getSearchFaculty();
	}
	@Transactional
	public void deleteCourse(Integer courseid) {
		studentdao.deleteCourse(courseid);
	}
	@Transactional
	public void AddCourse(Courses courses) {
		studentdao.AddCourse(courses);
	}
	@Transactional
	public List<MeetingTime> getAllMeetingTime() {
		return studentdao.getAllMeetingTime();
	}
	@Transactional
	public void Addmeeting(MeetingTime meetingtime) {
		studentdao.Addmeeting(meetingtime);
	}
	@Transactional
	public void AdminRegister(Admin admin) {
		studentdao.AdminRegister(admin);
	}

	@Transactional
	public List<FacultyRegister> getAllFacultyReg() {
		return studentdao.getAllFacultyReg();
	}
	
	@Transactional
	public void Addcircular(Circular circular) {
		this.studentdao.Addcircular(circular);
		
	}
	@Transactional
	public List<Circular> getAllFaculty() {
		
		return this.studentdao.getAllFaculty();
	}
	@Transactional
	public List<Circular> getTechnology() {

		return this.studentdao.getTechnology();
	}


    @Transactional
	public void studentRegister(Student student) {
		studentdao.studentregister(student);
		
	}


  



	
	

}
