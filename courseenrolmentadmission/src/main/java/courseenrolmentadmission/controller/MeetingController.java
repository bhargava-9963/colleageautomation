package courseenrolmentadmission.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import courseenrolmentadmission.model.MeetingTime;
import courseenrolmentadmission.service.StudentService;


@Controller
public class MeetingController {
	
	@Autowired
	private StudentService studentService;

	@RequestMapping(value ="/meeting" ,method=RequestMethod.GET)
	public String registerPage(Model model){
		model.addAttribute("meeting", new MeetingTime());
		
		return "meeting";
		}

	@RequestMapping("/meetingsuccess")
	public String listGrade(Model model,@ModelAttribute MeetingTime meetingtime) {
		studentService.Addmeeting(meetingtime);
		List<MeetingTime> list=studentService.getAllMeetingTime();
		model.addAttribute("meetinglist",list);
		return "meetingsuccess";
	}
	
	

	
	

	
}
