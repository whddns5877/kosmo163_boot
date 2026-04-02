package com.pjw.app.member;

import com.pjw.app.home.HomeController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//annotation 설명 + 기능
@Controller
@RequestMapping("/member/*")// /member/sub/abc =>**
public class MemberController {

    
	@RequestMapping("/join")
	public String join() {
		System.out.println("회원가입 페이지");
		
		return "member/join";
		
	
	}
	@RequestMapping("login")
	public String login() {
		System.out.println("로그인 페이지");

		return "member/login";

	}

}
