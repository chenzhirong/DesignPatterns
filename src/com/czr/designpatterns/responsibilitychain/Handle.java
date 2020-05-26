package com.czr.designpatterns.responsibilitychain;

public abstract class Handle {

	Handle handle;
	
	public Handle() {
		
	}

	public Handle(Handle handle) {
		this.handle = handle;
	}

	public Handle getHandle() {
		return handle;
	}

	public void setHandle(Handle handle) {
		this.handle = handle;
	}

	public abstract void executer(Request request);
}
