package com.suleman.springbootthymeleaf.mycontroller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class HomeController {

	
	
	
	@GetMapping("/showflowerList")
	public String sendDataToHtml(Model model) {
		String[] flowers = new String[] { "Rose", "Lily", "Tulip", "Carnation",
		"Hyacinth" };
		 
		String[] city = new String[] { "nyc", "nj", "dallas", "chicago",
		"philadelphia" };
		    model.addAttribute("flowersVariable", flowers);
		    model.addAttribute("cityVariable", city);
		    return "viewFlowers";
		}
}


