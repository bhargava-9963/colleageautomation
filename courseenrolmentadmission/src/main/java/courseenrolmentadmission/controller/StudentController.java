package courseenrolmentadmission.controller;

import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import courseenrolmentadmission.model.MeetingTime;
import courseenrolmentadmission.model.Placement;
import courseenrolmentadmission.model.Student;
import courseenrolmentadmission.model.StudentCrediential;
import courseenrolmentadmission.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping(value ="/register" ,method=RequestMethod.GET)
	public String registerPage(Model model){
		model.addAttribute("student", new Student());
		return "studentregister";
	}

	@RequestMapping(value ="/registerSuccess" ,method=RequestMethod.POST)
	public ModelAndView registerSuccess(@Valid @ModelAttribute("student") Student student,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return new ModelAndView("studentregister");
		}
		studentService.studentRegister(student);
		ModelAndView modelAndView = new ModelAndView("studentHome");
		modelAndView.addObject("student", student);
		return modelAndView;
	}
	
	
	
	@GetMapping("/studentLogin")
	public String loginPage(Model model){
		model.addAttribute("studentCredential", new StudentCrediential());
		return "studentLogin";
	}

	

	@PostMapping("/studentLoginSuccess")
	public ModelAndView loginSuccess(@Valid @ModelAttribute("studentCredential") StudentCrediential studentCredential,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return new ModelAndView("studentLogin");
		}
		ModelAndView modelAndView = new ModelAndView("studentHome");
		boolean studentValidate=studentService.validateStudentDetails(studentCredential);
		if(!studentValidate){
			 modelAndView = new ModelAndView("studentnotfound");
		}
		return modelAndView;
	}
	
	@RequestMapping(value="/applyplacement")
	public ModelAndView placementapply() {
         List<Placement> listofCompanies=studentService.listOfCpmpanies();   
	     return new ModelAndView("studentplacement","listofcompanys",listofCompanies);
	}
	
	@RequestMapping("/studentschedule")
	public String studentAnnouncemet(Model model) {
		List<MeetingTime> list=studentService.getAllMeetingTime();
		model.addAttribute("meetinglist",list);
		
		return "studentschedule";
	}
	
	
	
	@ModelAttribute
	public void headerMessage(Model model){
		model.addAttribute("headerMessage", "Welcome to Starve Technology");
		
		List<String> techList = new ArrayList<String>();
		techList.add("CSE");
		techList.add("ECE");
		techList.add("IT");
		techList.add("EEE");
		techList.add("MECH");
		
		List<String> citesList = new ArrayList<String>();
		citesList.add("VELLORE");
		citesList.add("CHENNAI");
		citesList.add("AMARAVATI");
		citesList.add("BOPAL");
		
		model.addAttribute("technologyList", techList);
		model.addAttribute("citesList", citesList);
	}

}
