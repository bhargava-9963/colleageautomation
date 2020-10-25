package courseenrolmentadmission.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import courseenrolmentadmission.model.Student;
import courseenrolmentadmission.model.StudentCrediential;
import courseenrolmentadmission.service.StudentService;


@Controller
public class AllumniController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/home")
	public String homePage() {
		return "home";
		
	}

	@RequestMapping("/homeview")
	public String homeView() {
		
		return "Allumniview";
	}
	
	@GetMapping("/login")
	public String loginPage(Model model){
		model.addAttribute("studentCredential", new StudentCrediential());
		return "login";
	}

	@PostMapping("/loginSuccess")
	public ModelAndView loginSuccess(@Valid @ModelAttribute("studentCredential") StudentCrediential studentCredential,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return new ModelAndView("login");
		}
		ModelAndView modelAndView = new ModelAndView("AllumniHome");
		boolean studentValidate=studentService.validateStudentDetails(studentCredential);
		if(!studentValidate){
			 modelAndView = new ModelAndView("notFound");
		}
		return modelAndView;
	}
	
	@RequestMapping("/list")
	public String listStudents(Model model) {
		List<Student> studentList=studentService.getAllStudents();
		model.addAttribute("studentlist",studentList);
		return "welcome";
	}
	
	

	@RequestMapping("/search")
	public String searchAllumni(Model model, @RequestParam("search") String search) {
		List<Student> searchStudent=studentService.getSearchStudents(search);
		model.addAttribute("studentlist",searchStudent);
		return "welcome";
	}
}
