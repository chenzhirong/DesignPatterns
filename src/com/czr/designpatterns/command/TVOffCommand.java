package com.czr.designpatterns.command;

/**
 * TV开机命令
 * @author chenzhirong
 *
 */
public class TVOffCommand implements Command {
	
	RecevieTV recevieTV;
	
	public TVOffCommand(RecevieTV recevieTV) {
		this.recevieTV = recevieTV;
	}

	@Override
	public void execute() {
		recevieTV.Off();
	}

}
