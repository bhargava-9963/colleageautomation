package courseenrolmentadmission.dao;

import java.util.List;


import courseenrolmentadmission.model.Circular;
import courseenrolmentadmission.model.Courses;
import courseenrolmentadmission.model.FacultyRegister;
import courseenrolmentadmission.model.MeetingTime;
import courseenrolmentadmission.model.Admin;
import courseenrolmentadmission.model.AdminCrediential;
import courseenrolmentadmission.model.Placement;
import courseenrolmentadmission.model.Student;
import courseenrolmentadmission.model.StudentCrediential;

public interface Studentdao {
	
	public List<Student> getAllStudents();
	
	public List<Student> getSearchStudents(String search);
	
	public boolean validateAdmin(AdminCrediential admincrediential);
	
	public void deleteStudent(Integer employeeid);
	
	public void addPlacement(Placement placement);
		
	public List<Placement> listOfCpmpanies();
	
	public boolean validateStudentDetails(StudentCrediential studentcrediential);
	
	public void AddCourse(Courses courses);
	
	public List<Courses> getAllCourses();
	
	public List<Courses> getSearchCourses();
	
	public List<Courses> getSearchFaculty();
	
	public void deleteCourse(Integer courseid);
	
	public void Addmeeting(MeetingTime meetingtime);
	
    public List<MeetingTime> getAllMeetingTime();
    
	public List<FacultyRegister> getAllFacultyReg();

	public void AdminRegister(Admin admin);
	
	public void Addcircular(Circular circular);
	
	public List<Circular> getAllFaculty();
	
	public abstract List<Circular> getTechnology();
	
	public void studentregister(Student student);
	

}
