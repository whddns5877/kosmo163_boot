package com.pjw.app.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//설명 + 실행
@Component
public class Robot {
	
	
	//강한 결합
	
	
	//pool에서 같은 타입을 찾아서 주입
	//2.같은 타입이 여러개라면 변수명과 일치하는 Bean name을 찾아서 주입
	@Autowired
	@Qualifier("la")
	private Arm leftArm;
	
	@Autowired
	private Arm rightArm;

	public Arm getLeftArm() {
		return leftArm;
	}

	public void setLeftArm(Arm leftArm) {
		this.leftArm = leftArm;
	}

	public Arm getRightArm() {
		return rightArm;
	}

	public void setRightArm(Arm rightArm) {
		this.rightArm = rightArm;
	}


}
	
	

