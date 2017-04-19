package design_pattern.ch01.check05;

public class TestMain {
	public static void main(String[] args) {
		Course c1 = new Course("Java");
		Course c2 = new Course("android");
		Course c3 = new Course("Database");
		Course c4 = new Course("Html");
		
		Student std1 = new Student("일일일");
		Student std2 = new Student("이이이");
		Student std3 = new Student("삼삼삼");
		
		std1.registerCourse(c1);		
		std1.registerCourse(c2);
		
		std2.registerCourse(c2);
		
		std3.registerCourse(c3);
		std3.registerCourse(c4);
		std3.dropCourse(c3);
		std3.registerCourse(c1);
		
		c1.registerStudent(std1);
		c1.registerStudent(std3);
		
		
		c4.registerStudent(std2);		// this...
		std2.registerCourse(c4);		// this...
		
		//*****************************//
		
		prnSubject1(std1);
		prnSubject2(std2);
		prnSubject3(std3);
		
		prnStudent1(c1);
		prnStudent2(c2);		
		
		prnThis1(c4);
		prnThis2(std2);
		
		
	}

	private static void prnThis1(Course c4) {
		System.out.println("====================================");
		System.out.println(c4.getTitle()+"을 수강하는 학생은?");
		System.out.println(c4.getStudents());
		
	}

	private static void prnThis2(Student std2) {
		System.out.println("*****************************");
		System.out.println(std2.getName()+"의 수강과목은?");
		System.out.println(std2.getCourses());		
		
	}

	private static void prnSubject1(Student std1) {
		System.out.println("====================================");
		System.out.println(std1.getName()+"의 수강과목은?");
		System.out.println(std1.getCourses());		
	}
	
	private static void prnSubject2(Student std2) {
		System.out.println("====================================");
		System.out.println(std2.getName()+"의 수강과목은?");
		System.out.println(std2.getCourses());		
	}
	
	private static void prnSubject3(Student std3) {
		System.out.println("====================================");
		System.out.println(std3.getName()+"의 수강과목은?");
		System.out.println(std3.getCourses());		
	}
	
	private static void prnStudent1(Course c1) {
		System.out.println("====================================");
		System.out.println(c1.getTitle()+"을 수강하는 학생은?");
		System.out.println(c1.getStudents());
	}
	
	private static void prnStudent2(Course c2) {
		System.out.println("====================================");
		System.out.println(c2.getTitle()+"을 수강하는 학생은?");
		System.out.println(c2.getStudents());
	}
}
