package org.lockers.com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class writer {

	public static void main(String[] args) {

		String dir = System.getProperty("user.dir").concat("\\userFiles\\UserCreds");

		try (FileWriter f = new FileWriter(dir, true);
				BufferedWriter b = new BufferedWriter(f);
				PrintWriter p = new PrintWriter(b);) {
			p.println("Gaura/pass3");

		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}