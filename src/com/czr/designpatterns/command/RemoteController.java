package com.czr.designpatterns.command;

public class RemoteController {
	
	Command startCommands[];
	
	Command offCommands[];
	
	public RemoteController() {
		startCommands = new Command[5];
		offCommands = new Command[5];
		for (int i = 0; i < 5; i++) {
			startCommands[i] = new NullCommand();
			offCommands[i] = new NullCommand();
		}
	} 
	
	public void setCommand(int i, Command startCommand,Command offCommand) {
		startCommands[i] = startCommand;
		offCommands[i] = offCommand;
	}
	
	public void onButtonWasPushed(int i) {
		startCommands[i].execute();
	}
	
	public void offButtonWasPushed(int i) {
		offCommands[i].execute();
	}
	
}
