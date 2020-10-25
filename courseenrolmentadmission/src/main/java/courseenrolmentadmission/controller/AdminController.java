package courseenrolmentadmission.controller;

import java.util.List;


import javax.validation.Valid;
 
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import courseenrolmentadmission.model.AdminCrediential;
import courseenrolmentadmission.model.Placement;
import courseenrolmentadmission.model.Student;
import courseenrolmentadmission.service.StudentService;

@Controller
public class AdminController {

	
	private static final Logger logger = LogManager.getLogger(AdminController.class);  
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/adminlogin")
	public String adminLoginLoad(Model model) {
		logger.info("load the admin page");  
		model.addAttribute("adminCrediential", new AdminCrediential());
		return "adminLogin";
	}
	
	

	@PostMapping("/adminloginSuccess")
	public ModelAndView loginSuccess(@Valid @ModelAttribute("adminCrediential") AdminCrediential adminCrediential,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return new ModelAndView("adminLogin");
		}
		
		ModelAndView modelAndView = new ModelAndView("adminHome");
		boolean adminValidate=studentService.validateAdmin(adminCrediential);
		if(!adminValidate){
			logger.error("admin details cannot found");  
			 modelAndView = new ModelAndView("adminnotfound");
		}
		return modelAndView;
	}
	
	
	
	
	@RequestMapping("/adminStudentlist")
	public String listStudents(Model model) {
		List<Student> studentList=studentService.getAllStudents();
		model.addAttribute("studentlist",studentList);
		return "adminStudent";
	}
	
	

	@RequestMapping("/searchstudent")
	public String searchAllumni(Model model, @RequestParam("search") String search) {
		List<Student> searchStudent=studentService.getSearchStudents(search);
		model.addAttribute("studentlist",searchStudent);
		return "adminStudent";
	}
	
	
	@RequestMapping("/deleteStudent")
	public ModelAndView deleteStudent(@RequestParam("id") int id) {
		
		studentService.deleteStudent(id);
		
		logger.info("delete student success");
		
		return new ModelAndView("redirect:/adminStudentlist");

		
	}
	

	
	@RequestMapping("/placement")
	public String placementPage(Model model) {
		model.addAttribute("placement", new Placement());
		
		
		
		 List<Placement> listOfCompanies=studentService.listOfCpmpanies();
		 
	     model.addAttribute("listofcompanys", listOfCompanies);
		return "placement";
	}

	
	
	@RequestMapping("/placementsuccess")
	public String placementSave(@Valid @ModelAttribute("placement") Placement placement, BindingResult bindingResult) {
		if(bindingResult.hasErrors()){
			return "placement";
		}
		
	 studentService.addPlacement(placement);
	 return "redirect:/placement";
		
	}
	

	
}
