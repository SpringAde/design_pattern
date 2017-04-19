package design_pattern.ch01.check04;

public class TestMain {
	public static void main(String[] args) {
		Course c1 = new Course("Java");
		Course c2 = new Course("android");
		Course c3 = new Course("Database");
		Course c4 = new Course("Html");
		
		Student s1 = new Student("라라라");
		s1.registerCourse(c1);
		s1.registerCourse(c3);
		s1.registerCourse(c3);
		s1.dropCourse(c3);
		s1.registerCourse(c3);
		
		System.out.println(s1);
		
	}
}
