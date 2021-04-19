package org.lockers.com;

import java.util.Scanner;

public class UserInterface {
	
	
	 void exit()
	{
		System.out.println("Thanks, You have sucessfully Exited from your source code programme !");
	}
	
	//Prompt user interface options.
	void userInterface()
	{
		System.out.println("Select any option from below ");
		System.out.println("1. Retrieving the file names ");
		System.out.println("2. Menu for File operation  ");
		System.out.println("3. Close application  ");
		
		//Read Input from user
		Scanner input=new Scanner(System.in);
		int option= input.nextInt();
		
		switch(option)
		{
		case 1: new FileOperations().listFiles(); break;
			
		case 2:new FileOperations().businessOperations(); break;
		
		case 3: exit(); break;
		}
		
input.close();
	}
			
}
