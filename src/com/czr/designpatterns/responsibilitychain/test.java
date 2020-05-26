package com.czr.designpatterns.responsibilitychain;

public class test {

	public static void main(String[] args) {
		
		Request request = new Request();
		request.setId(1);
		request.setVal(200);
		
		Handle handleA = new HandleA();
		Handle handleB = new HandleB();
		Handle handleC = new HandleC();
		
		handleA.setHandle(handleB);
		handleB.setHandle(handleC);
		handleC.setHandle(handleA);
		
		handleA.executer(request);
		
	}

}
