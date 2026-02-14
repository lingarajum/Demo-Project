package com.dcl.target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dcl.dependent.IEngine;

@Service
public class Car {

	@Autowired
	private IEngine engine;

	public Car() {

		System.out.println("Car-0-par-constructor");
	}

	public Car(IEngine engine) {
		this.engine = engine;
		System.out.println("Car-par-constructor");
	}

	public void move() {
		boolean status = engine.start();
		if(status) {
			System.out.println("Car is moving");
		}
		else {
			System.out.println("Car is  not moving");
		}
		
	}

}
