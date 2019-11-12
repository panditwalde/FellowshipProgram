package com.bridgelabz.proxy;

public class Client {

	public static void main(String[] args) {
		CommandExecutor executor=new CommandExecutorProxy("pandit", "pass");
		try {
			
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		}catch(Exception e)
		{
			System.out.println("Error :"+e.getMessage());
		}

	}

}
