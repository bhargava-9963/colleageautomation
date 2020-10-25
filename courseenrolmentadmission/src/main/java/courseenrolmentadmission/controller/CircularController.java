package courseenrolmentadmission.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import courseenrolmentadmission.model.Circular;
import courseenrolmentadmission.service.StudentService;



@Controller
public class CircularController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/circular")
	public String registerPage(Model model){
		model.addAttribute("circular", new Circular());
		
		List<Circular> circularlist=studentService.getTechnology();
		model.addAttribute("circularlist",circularlist);
		return "circular";
		}

	@RequestMapping("/circularsuccess")
	public String listStudents(Model model ,@ModelAttribute Circular circular) {
		studentService.Addcircular(circular);
		List<Circular> list=studentService.getAllFaculty();
		model.addAttribute("list",list);
		return "circularsuccess";
	}
	

	
	

	
}

