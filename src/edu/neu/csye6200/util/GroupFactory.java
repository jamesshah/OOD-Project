package edu.neu.csye6200.util;

import edu.neu.csye6200.model.Group;

/**
 * Concrete GroupFactory class to create objects of Group class.
 * @author james
 *
 */
public class GroupFactory {
	private static GroupFactory groupFactoryInstance;
	
	private GroupFactory() {
		groupFactoryInstance = null;
	}
	
	public static GroupFactory getInstance() {
		if(groupFactoryInstance == null) {
			groupFactoryInstance= new GroupFactory();
		}
		
		return groupFactoryInstance;
	}
	
	public Group getObject(int capacity) {
		return new Group(capacity);
	}
}