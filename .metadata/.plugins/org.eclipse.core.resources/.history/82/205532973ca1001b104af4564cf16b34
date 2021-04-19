package org.lockers.com;

import java.util.Scanner;

public class Welcome {
	public static void main(String[] args) {
		// Welcome Page

		System.out.println("Welcome to the new Lockers.com");
		System.out.println("Developed By Naveenraj Venkatachalam \n");
		System.out.println("******_______********");
		System.out.println("Select option: \n" + "1.Login User\n" + "2.Signup/Register User");
		int option = new Scanner(System.in).nextInt();
		switch (option) {

		case 1:
			Boolean validation = new Login().login();

			if (validation == true) {
				System.out.println("Welcome to Lockers.com");
				System.out.println("******_______*******");
				System.out.println("Developed By Naveenraj Venkatachalam");
				System.out.println();
				// Call UserInterface function
				UserInterface ui = new UserInterface();
				ui.userInterface();
			} else {
				System.out.println("You are Not a valid User ");
			}
			break;

		case 2:
			new Login().RegisterUser(); 
			break;
			 
			
		}
	}
}
