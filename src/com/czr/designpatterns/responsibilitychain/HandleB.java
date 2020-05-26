package com.czr.designpatterns.responsibilitychain;

public class HandleB extends Handle {
	
	@Override
	public void executer(Request request) {
		if(request.getVal() > 100   && request.getVal() <= 200) {
			System.out.println("handleB"+request.getVal());
		}else {
			handle.executer(request);
		}

	}

}
