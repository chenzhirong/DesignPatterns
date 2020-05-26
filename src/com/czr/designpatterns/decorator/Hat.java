package com.czr.designpatterns.decorator;

public class Hat extends Decorate{
	
	public Hat(Person person ) {
		super(person);
		setClothing( "帽子");
	}

}
