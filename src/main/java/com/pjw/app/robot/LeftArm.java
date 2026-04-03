package com.pjw.app.robot;

import org.springframework.stereotype.Component;

@Component("la")
public class LeftArm implements Arm{

	@Override
	public void work() {
		System.out.println("왼쪽 팔");		
	}
}
