package com.czr.designpatterns.command;

public class RecevieTV {
	
	public String name;
	
	public RecevieTV(String name) {
		this.name = name;
	}
	
	public void start() {
		System.out.println(name+"开机");
	}
	
	public void Off() {
		System.out.println(name+"关机");
	}
	
	public void play() {
		System.out.println("");
	}

}
