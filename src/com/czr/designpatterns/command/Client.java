package com.czr.designpatterns.command;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteController remoteController = new RemoteController();
		
		//电脑
		ReceiveComputer receiveComputer = new ReceiveComputer();
		ComputerStartCommand startCommand = new ComputerStartCommand(receiveComputer);
		
		ComputerOffCommand offCommand = new ComputerOffCommand(receiveComputer);
		
		remoteController.setCommand(2, startCommand, offCommand);
		
		remoteController.onButtonWasPushed(2);
		remoteController.offButtonWasPushed(2);
		
		//TV
		RecevieTV recevieTV = new RecevieTV("华为");
		TVStartCommand tvStartCommand = new TVStartCommand(recevieTV);
		TVOffCommand tvOffCommand = new TVOffCommand(recevieTV);
		remoteController.setCommand(3, tvStartCommand, tvOffCommand);
		remoteController.onButtonWasPushed(3);
		remoteController.offButtonWasPushed(3);

	}

}
