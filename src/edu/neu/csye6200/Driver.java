package edu.neu.csye6200;

import edu.neu.csye6200.ui.Login;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("\t" + Driver.class.getName() + ".main()...");
		
		Login.launch();
		
		System.out.println("\t" + Driver.class.getName() + ".main()...Done!");

	}

}
