package com.czr.designpatterns.command;

/**
 * 电脑启动命令
 * @author chenzhirong
 *
 */
public class ComputerStartCommand implements Command {
	
	ReceiveComputer receiveComputer;
	
	public ComputerStartCommand(ReceiveComputer receiveComputer) {
		this.receiveComputer = receiveComputer;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiveComputer.start();
	}

}
