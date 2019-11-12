package com.bridgelabz.proxy;

public class CommandExecutorImp implements CommandExecutor {

	@Override
	public void runCommand(String cmd) throws Exception {

		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "'command executed.");
	}

}
