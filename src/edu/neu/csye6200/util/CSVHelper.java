package edu.neu.csye6200.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import edu.neu.csye6200.controller.RegistrationController;
import edu.neu.csye6200.controller.TeacherRegistrationController;
import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.model.Teacher;

public class CSVHelper {
			
	public static void enrollStudents(String filePath) throws IOException {
		File studentFile = new File(filePath);
		BufferedReader br = new BufferedReader(new FileReader(studentFile));
						
		String line;
		while((line = br.readLine()) != null) {
			Student s = new Student(line);
			RegistrationController controller = new RegistrationController();
			Boolean res = controller.enrollStudent(
					s.getFirstName(), 
					s.getLastName(), 
					""+s.getAge(), 
					s.getDateOfBirth().toString(), 
					s.getAddress(), 
					s.getGuardianName(), 
					s.getGuardianEmail(), 
					s.getGuardianPhoneNumber(), 
					s.getRegistrationDate().toString()
				);
			
			if(res) {
				System.out.println("Enrolled " + s.getFirstName() + " successfully.");
			} else {
				System.out.println("Some error occurred");
			}
		}		
		br.close(); 
	}
	
	public static void registerTeachers(String filePath) throws IOException {
		File teachersFile = new File(filePath);
		BufferedReader br = new BufferedReader(new FileReader(teachersFile));
						
		String line;
		while((line = br.readLine()) != null) {
			Teacher s = new Teacher(line);
			TeacherRegistrationController controller = new TeacherRegistrationController();
			Boolean res = controller.registerTeacher(
					s.getFirstName(), 
					s.getLastName(), 
					""+s.getAge(), 
					s.getDateOfBirth().toString(), 
					s.getAddress(), 					
					s.getEmail(), 
					s.getPhoneNumber(),					
					s.getJoiningDate().toString()
				);
			
			if(res) {
				System.out.println("Registered " + s.getFirstName() + " successfully.");
			} else {
				System.out.println("Some error occurred");
			}
		}	
		br.close(); 
	}

}
