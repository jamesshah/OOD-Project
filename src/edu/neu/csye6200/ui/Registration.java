package edu.neu.csye6200.ui;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Registration {
	
	public Registration() {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 400);
		
		JTextField aTextField = new JTextField();
		aTextField.setBounds(275, 25, 200, 40);
		frame.add(aTextField);
		
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public static void launch() {
		new Registration();
	}

}
