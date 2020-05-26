package com.czr.designpatterns.responsibilitychain;

public class HandleA extends Handle {
	
	@Override
	public void executer(Request request) {
		if(request.getVal() <= 100) {
			System.out.println("handleA"+request.getVal());
		}else {
			handle.executer(request);
		}

	}

}
