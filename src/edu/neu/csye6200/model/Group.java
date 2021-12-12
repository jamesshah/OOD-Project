package edu.neu.csye6200.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {
	
	private String id;
	private int capacity;
	private Teacher teacher;
	private List<Student> students;
	
	public Group() {
		// To-Do: Implement the assigning id to group, creating a teacher
		id = "Random-ID";
		teacher = new Teacher(id, id, null, 0, 0, null, id, id, id, 0);
		students = new ArrayList<Student>();		
	}
	
	public Group(int capacity) {
		this.capacity = capacity;
		id = "Random-ID";
		teacher = new Teacher(id, id, null, 0, 0, null, id, id, id, 0);
		students = Arrays.asList(new Student[capacity]);
	}
	
	
	// Get the teacher of the group
	public Teacher getTeacher() {
		return teacher;
	}
	
	// Get the list of students
	public List<Student> getStudents(){
		return students;
	}
	 
	// Assign a teacher to the Group
	public void addTeacher(Teacher t) {
		this.teacher = t;
	}
	
	// Add a student to the group
	public void addStudent(Student s) {
		this.students.add(s);
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}		

}
