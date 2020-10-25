package courseenrolmentadmission.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import courseenrolmentadmission.model.Courses;
import courseenrolmentadmission.service.StudentService;


@Controller
public class CourseController {
	
	@Autowired
	private StudentService studentService;

	
	@RequestMapping(value ="/course" ,method=RequestMethod.GET)
	public String registerPage(Model model){
		model.addAttribute("courses", new Courses());
		List<Courses> course=studentService.getSearchCourses();
		model.addAttribute("courselist",course);
		List<Courses> searchFaculty=studentService.getSearchFaculty();
		model.addAttribute("facultylist",searchFaculty);
		return "course";
		}

	@RequestMapping("/coursesuccess")
	public String listStudents(Model model ,@ModelAttribute Courses courses) {
		studentService.AddCourse(courses);
		List<Courses> list=studentService.getAllCourses();
		model.addAttribute("list",list);
		return "coursesuccess";
	}

	@GetMapping("/deleteCourse")
    public ModelAndView deleteCourse(HttpServletRequest request) {
        int courseid = Integer.parseInt(request.getParameter("courseid"));
        studentService.deleteCourse(courseid);
        return new ModelAndView("coursesuccess");
    }
 
	

	
	

	
}
