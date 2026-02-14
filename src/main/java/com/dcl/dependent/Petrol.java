package com.dcl.dependent;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Petrol implements IEngine {

	public Petrol() {
		System.out.println("Petrol Constructor called");
	}

	@Override
	public boolean start() {
		System.out.println("Petrol Engine Started");
		return true;
	}

	

}
