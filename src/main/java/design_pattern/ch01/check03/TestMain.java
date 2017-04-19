package design_pattern.ch01.check03;

public class TestMain {
	public static void main(String[] args) {
		Student student = new Student();
		Professor advisor = new Professor();
		student.setAdvisor(advisor);
		advisor.setStudent(student);
		
		System.out.println(student.getAdvisor());
		System.out.println(advisor.getStudent());
	}
}
