package com.pjw.app.robot;

import org.springframework.stereotype.Component;

@Component
public class RightArm implements Arm{

	@Override
	public void work() {
		System.out.println("오른쪽 팔");
		
	}
	

}
