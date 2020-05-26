package com.czr.designpatterns.responsibilitychain;

public class HandleC extends Handle {
	
	@Override
	public void executer(Request request) {
		if( request.getVal() > 200 && request.getVal() <= 300) {
			System.out.println("handleC"+request.getVal());
		}else {
			handle.executer(request);
		}
	}

}
