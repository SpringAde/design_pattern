package design_pattern.ch01.check04;

import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<Course> courses;
	
	
	public Student() {
		courses = new ArrayList<>();
	}
	
	public Student(String name) {
		this();
		this.name = name;
	}


	public void registerCourse(Course course){
		if(!courses.contains(course)){
			courses.add(course);
		}
	}
	
	public void dropCourse(Course course){
		if(!courses.contains(course)){
			courses.remove(course);
		}
	}

	@Override
	public String toString() {
		return String.format("Student [name=%s, courses=%s]", name, courses);
	}
}
