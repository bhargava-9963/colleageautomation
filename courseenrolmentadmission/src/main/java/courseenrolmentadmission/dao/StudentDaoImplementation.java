package courseenrolmentadmission.dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import courseenrolmentadmission.model.Circular;
import courseenrolmentadmission.model.Courses;
import courseenrolmentadmission.model.FacultyRegister;
import courseenrolmentadmission.model.MeetingTime;
import courseenrolmentadmission.model.Admin;
import courseenrolmentadmission.model.AdminCrediential;
import courseenrolmentadmission.model.Placement;
import courseenrolmentadmission.model.Student;
import courseenrolmentadmission.model.StudentCrediential;

import java.util.List;


@Repository
public class StudentDaoImplementation implements Studentdao{
    @Autowired
    private SessionFactory sessionFactory;

	public boolean validateStudentDetails(StudentCrediential studentcrediential) {
		
		Session session=sessionFactory.getCurrentSession();
		
		Student student=(Student)session.createQuery("FROM Student c where c.email=:email and c.password=:password"+"").setParameter("email", studentcrediential.getEmail()).setParameter("password", studentcrediential.getPassword()).uniqueResult();
		boolean userfound=true;
		if(student==null) {
			userfound=false;	
		}
		return userfound;
	}
	


	public List<Student> getAllStudents() {
		Session session=sessionFactory.getCurrentSession();
		String queary="from Student";
		return session.createQuery(queary).list();

	}
	public List<Student> getSearchStudents(String search) {
		
		
		Session session=sessionFactory.getCurrentSession();
		
		String queary="from Student as stu where stu.email Like '%"+search+"%'";
		return session.createQuery(queary).list();
	}
	
	
	public boolean validateAdmin(AdminCrediential admincrediential) {
		Session session=sessionFactory.getCurrentSession();
		
		Admin adminvalidate=(Admin)session.createQuery("FROM Admin c where c.femail=:email and c.fpassword=:password"+"").setParameter("email", admincrediential.getEmail()).setParameter("password", admincrediential.getPassword()).uniqueResult();
		boolean userfound=true;
		if(adminvalidate==null) {
			userfound=false;	
		}
		return userfound;
	
		
	}



	public void deleteStudent(Integer employeeid) {
		
		Student student=sessionFactory.getCurrentSession().load(Student.class, employeeid);
		if(student!=null) {
			this.sessionFactory.getCurrentSession().delete(student);
			
		}
		
	}

	public void addPlacement(Placement placement) {
        Session session=sessionFactory.getCurrentSession();
		session.save(placement);
	}

	public List<Placement> listOfCpmpanies() {
		Session session=sessionFactory.openSession();
		try {
		String queary="from Placement";
		return session.createQuery(queary).list();
		}finally {
			session.close();
		}
	}
	
	public void AddCourse(Courses courses) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(courses);
	}
    
	public List<Courses> getSearchFaculty() {
        Session session=sessionFactory.getCurrentSession();
		
		String queary="select s.facultyName from Courses s";
		return session.createQuery(queary).list();
	}
	
	public List<Courses> getAllCourses() {
		Session session=sessionFactory.getCurrentSession();
	     String queary="from Course";
	     
	     return session.createQuery(queary).list();

	}

	public List<Courses> getSearchCourses() {
     Session session=sessionFactory.getCurrentSession();
		
		String queary="select s.courseName from Courses s";
		return session.createQuery(queary).list();
	}
	public void deleteCourse(Integer courseid) {
		Courses courses = sessionFactory.getCurrentSession().load(Courses.class, courseid);
        if (null != courses) {
            this.sessionFactory.getCurrentSession().delete(courses);
            
        }
        }
	
	public List<MeetingTime> getAllMeetingTime() {
		Session session=sessionFactory.getCurrentSession();
	     String queary="from MeetingTime";
	     
	     return session.createQuery(queary).list();
	}

	public void Addmeeting(MeetingTime meetingtime) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(meetingtime);
		
		
	}
	public List<FacultyRegister> getAllFacultyReg() {
		Session session=sessionFactory.getCurrentSession();
	     String queary="from FacultyRegister";
	     
	     return session.createQuery(queary).list();
	}

	
	public void AdminRegister(Admin admin) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(admin);
		
	}
	public void Addcircular(Circular circular){
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(circular);

		}

	public List<Circular> getAllFaculty() {
		Session session=sessionFactory.getCurrentSession();
	    String queary="from Circular";
	    return session.createQuery(queary).list();
	}
	public List<Circular> getTechnology() {
		Session session=sessionFactory.getCurrentSession();
		
		String queary="select f.technology from Student f";
		return session.createQuery(queary).list();


	}



	public void studentregister(Student student) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(student);
		
	}



	
	
	
}
