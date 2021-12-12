package edu.neu.csye6200.util;

import edu.neu.csye6200.model.Classroom;
import edu.neu.csye6200.model.Group;

/**
 * Concrete ClassroomFactory class to create objects of Classroom class.
 * @author james
 *
 */
public class ClassroomFactory {
	private static ClassroomFactory classroomFactoryInstance;
	
	private ClassroomFactory() {
		classroomFactoryInstance = null;
	}
	
	public static ClassroomFactory getInstance() {
		if(classroomFactoryInstance == null) {
			classroomFactoryInstance= new ClassroomFactory();
		}
		
		return classroomFactoryInstance;
	}
	
	public Classroom getObject(String id, int classroomCapacity, Group group) {
		return new Classroom(id, classroomCapacity, group);
	}

}
