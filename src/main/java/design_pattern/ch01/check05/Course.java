package design_pattern.ch01.check05;

import java.util.ArrayList;

public class Course {
	private ArrayList<Student> students;
	private String title;
	
	public Course() {
		students = new ArrayList<>();
	}	
	
	public Course(ArrayList<Student> students, String title) {		
		this.students = students;
		this.title = title;
	}
	
	public Course(String title) {
		students = new ArrayList<>();
		this.title = title;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	
	public void registerStudent(Student student){
		if(!students.contains(student)){
			
			
			students.add(student);	
			student.registerCourse(this);		
		}
	}
	
	public void dropStudent(Student student){
		if(students.contains(student)){
			students.remove(student);
			student.dropCourse(this);	// 과목에 학생을 추가하면, 동시에 학생에게도 과목을 추가
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (students == null) {
			if (other.students != null)
				return false;
		} else if (!students.equals(other.students))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return String.format("%s", title);
	}
	
}
