package edu.neu.csye6200.util;

import edu.neu.csye6200.model.Person;
import edu.neu.csye6200.model.Teacher;

/**
 * Concrete TeacherFactory class inherited by PersonFactory to create objects of Teacher class.
 * @author james
 *
 */
public class TeacherFactory extends PersonFactory{
	
	private static TeacherFactory teacherFactoryInstance;
	
	private TeacherFactory() {
		teacherFactoryInstance = null;
	}
	
	public static TeacherFactory getInstance() {
		if(teacherFactoryInstance == null) {
			teacherFactoryInstance= new TeacherFactory();
		}
		
		return teacherFactoryInstance;
	}

	@Override
	public Person getObject(String csvData) {
		return new Teacher(csvData);
	}

}
