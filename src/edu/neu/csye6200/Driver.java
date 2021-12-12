package edu.neu.csye6200;

import edu.neu.csye6200.ui.Registration;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("\t" + Driver.class.getName() + ".main()...");
		
		Registration.launch();
		
		System.out.println("\t" + Driver.class.getName() + ".main()...Done!");

	}

}
