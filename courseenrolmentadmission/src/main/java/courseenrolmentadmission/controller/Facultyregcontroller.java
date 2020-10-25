package courseenrolmentadmission.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import courseenrolmentadmission.model.Admin;

import courseenrolmentadmission.service.StudentService;


@Controller
public class Facultyregcontroller {
	
	@Autowired
	private StudentService studentService;

	
	@RequestMapping(value ="/adminregisterpage" ,method=RequestMethod.GET)
	public String registerPage(Model model){
		model.addAttribute("facultyreg", new Admin());
		return "adminregisterpage";
		}

	@RequestMapping("/registersuccess")
	public String listStudents(Model model ,@ModelAttribute("facultyreg") Admin facultyreg,BindingResult bindingResult) {
		
		
		if(bindingResult.hasErrors()){
			return "adminregisterpage";
		}
		studentService.AdminRegister(facultyreg);
		
		return "redirect:/adminlogin";
	}

}
