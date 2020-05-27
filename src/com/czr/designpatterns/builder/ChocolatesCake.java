package com.czr.designpatterns.builder;

public class ChocolatesCake extends Builder {

	@Override
	public void builderName() {
		// TODO Auto-generated method stub
		product.setName("巧克力");

	}

	@Override
	public void builderColour() {
		// TODO Auto-generated method stub
		product.setName("黑色");
	}

	@Override
	public void builderHigth() {
		// TODO Auto-generated method stub
		product.setName("三层");

	}

}
