package com.ram.tusk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ram.tusk.dao.Feedbackdao;
import com.ram.tusk.model.Feedback;

@Controller
public class IndexController

{
	 @Autowired
	Feedbackdao fbd;
	 
	 Feedback feedback;
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
		
	}
	@RequestMapping("/feedback")
	public String feedback() {
		return "feedback.jsp";
		
	}
	@RequestMapping("/addFeedback")
	//public String addFeedback(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("reg") String reg,@RequestParam("code") String code,@RequestParam("msg") String msg,@RequestParam("rating") int rating)
	
	public String addFeedback(@ModelAttribute("feedback") Feedback feedback)
	{
		//feedback = new Feedback(name,email,reg,code,rating);
		fbd.addfeedback(feedback);
		return "welcome.jsp";
	}
	

}
