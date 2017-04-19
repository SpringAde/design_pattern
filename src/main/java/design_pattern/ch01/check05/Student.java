package design_pattern.ch01.check05;

import java.util.ArrayList;

import design_pattern.ch01.check05.Course;

public class Student {
	private String name;
	private ArrayList<Course> courses;
	
	public Student() {
		courses = new ArrayList<>();
	}
	public Student(String name) {
		this();	//courses = new ArrayList<>();를 가져와야 함으로써...
		this.name = name;
	}
	
	public void registerCourse(Course course){		
		if(!courses.contains(course)){
			courses.add(course);
			course.registerStudent(this);	// 학생에게 과목이 추가되면 과목에게도 그 해당 학생을 추가	
		}
	}
	
	public void dropCourse(Course course){
		if(courses.contains(course)){
			courses.remove(course);
			course.dropStudent(this);
		}
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Course> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	
	@Override
	public String toString() {
		//return String.format("%s, %s", name, courses);
		return String.format("%s", name);
	}
}