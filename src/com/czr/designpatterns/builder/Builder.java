package com.czr.designpatterns.builder;

public abstract class Builder {
	
	Product product;
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public abstract void builderName();
	
	public abstract void builderColour();
	
	public abstract void builderHigth();
	
	public Product builderProduct() {
		builderName();
		builderColour();
		builderHigth();
		return product;
	}
	

}
