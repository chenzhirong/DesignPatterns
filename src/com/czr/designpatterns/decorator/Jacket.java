package com.czr.designpatterns.decorator;

public class Jacket extends Decorate{

	public Jacket(Person person ) {
		super(person);
		setClothing("上衣");
	}
	
}
