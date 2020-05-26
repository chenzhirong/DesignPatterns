package com.czr.designpatterns.command;

/**
 * 电脑开机命令
 * @author chenzhirong
 *
 */
public class ComputerOffCommand implements Command {
	
	ReceiveComputer receiveComputer;
	
	public ComputerOffCommand(ReceiveComputer receiveComputer) {
		this.receiveComputer = receiveComputer;
	}

	@Override
	public void execute() {
		receiveComputer.off();
	}
}
