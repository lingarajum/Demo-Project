package com.dcl.dependent;

import org.springframework.stereotype.Component;

@Component("engine")
public class Diesel implements IEngine {

	public Diesel() {
		System.out.println("Diesel constructor called");
	}

	@Override
	public boolean start() {
		System.out.println("Diesel Engine Started");
		return true;
	}

}
