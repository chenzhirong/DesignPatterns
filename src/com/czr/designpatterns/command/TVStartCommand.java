package com.czr.designpatterns.command;

/**
 * TV开机命令
 * @author chenzhirong
 *
 */
public class TVStartCommand implements Command {
	
	RecevieTV recevieTV;
	
	public TVStartCommand(RecevieTV recevieTV) {
		this.recevieTV = recevieTV;
	}

	@Override
	public void execute() {
		recevieTV.start();
	}

}
