package com.czr.designpatterns.decorator;

public class Decorate extends Person {
	
	Person person;
	
	public Decorate(Person person) {
		this.person = person;
	}
	
	@Override
	public String addClothing() {
//		System.out.println("Decorate_person.addClothing()="+person.addClothing());
		System.out.println("Decorate_this.getClothing()="+this.clothing);
		System.out.println("------------------------------");
		return  person.addClothing()+ "," + this.clothing;
	}

}
