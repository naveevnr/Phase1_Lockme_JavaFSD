package org.lockers.com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Login {
	Scanner s = new Scanner(System.in);
	public String dir = System.getProperty("user.dir").concat("\\userFiles\\UserCreds");
	ArrayList list = new ArrayList();

	boolean login() {
		int count = 0;
		File myObj = new File(dir);
		Scanner myReader = null;
		boolean flag = false;
		try {
			myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				list.add(data);

			}

			while (count < 3) {
				System.out.println("Enter your UserName :");

				String userName = new Scanner(System.in).next();
				System.out.println("Enter your password :");
				String password = s.next();
				String mergeCreds = userName.concat("/" + password);

				for (int i = 0; i < list.size(); i++) {
					if (mergeCreds.equals(list.get(i))) {
						flag = true;
						break;
					} else
						flag = false;
				}
				if (flag == true) {
					System.out.println("Login succesfull");
					break;

				} else {
					count++;
					if (count == 3) {
						new UserInterface().exit();
					} else {
						System.out.println("Invalid user name / password \n you will be exited from application after 3 unsuccesfull login attempts");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

					}

				}
			}

		//	myReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;

	}
	
	void RegisterUser() {
		Scanner s = new Scanner(System.in);
		String dir = System.getProperty("user.dir").concat("\\userFiles\\UserCreds");

		System.out.println("Enter UserName to Register:");
		String userName = s.next();
		System.out.println("Enter Password to Register:");
		String pass = s.next();
		s.close();
		String mergeCreds = userName.concat("/" + pass);

		try (FileWriter f = new FileWriter(dir, true);
				BufferedWriter b = new BufferedWriter(f);
				PrintWriter p = new PrintWriter(b);) {
			p.println(mergeCreds);
			System.out.println("Succesfully registered to locker.com\n");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			

		} catch (IOException i) {
			i.printStackTrace();
		}

	}


}