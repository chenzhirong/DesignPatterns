package com.czr.designpatterns.decorator;

public class Shorts extends Decorate{
	
	public Shorts(Person person ) {
		super(person);
		setClothing("短裤");
	}

}
