package edu.neu.csye6200.model;

import java.util.Arrays;
import java.util.List;

public class Classroom {
	
	private String id;
	private int classroomCapacity;
	private List<Group> groups;
	
	public Classroom(String id, int classroomCapacity, Group group) {
		this.id = id;
		groups = Arrays.asList(new Group[classroomCapacity]);
		groups.add(group); 
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getClassroomCapacity() {
		return classroomCapacity;
	}

	public void setClassroomCapacity(int classroomCapacity) {
		this.classroomCapacity = classroomCapacity;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}	
}
