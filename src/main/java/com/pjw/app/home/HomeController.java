package com.pjw.app.home;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pjw.app.robot.LeftArm;
import com.pjw.app.robot.Robot;

@Controller
public class HomeController {
	
	@Autowired
	private Robot robot;
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String home() throws Exception {
		
		
		
		
		
		
	
		
		return "index";
		
		
		
	}
	

}
