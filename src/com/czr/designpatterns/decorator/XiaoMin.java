package com.czr.designpatterns.decorator;

public class XiaoMin extends Person {
	
	public  XiaoMin(String name) {
		setName(name);
		setClothing(name);
	}

	@Override
	public String addClothing() {
		System.out.println("XiaoMin_addClothing"+super.getClothing());
		return super.getClothing();
	}

}
