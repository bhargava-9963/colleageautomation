package courseenrolmentadmission.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
	
	@RequestMapping("/logout")
	public String logout() {
		
		return "redirect:/";
		
	}
	
	@RequestMapping("/")
	public String homepage() {
		
		return "mainpage";
		
	}
	
	@RequestMapping("/loginsecurity")
	public String loginsecurity() {
		return "loginsecurity";
	}

}
