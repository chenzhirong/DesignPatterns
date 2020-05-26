package com.czr.designpatterns.decorator;

/**
 * 主体（被装饰者）
 * 
 * @author chenzhirong
 *
 */
public abstract class Person {

	public String name;

	public String clothing;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClothing() {
		return clothing;
	}

	public void setClothing(String clothing) {
		this.clothing = clothing;
	}

	public abstract String addClothing();

}
