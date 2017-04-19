package design_pattern.ch01.check02;

public class TestMain {
	public static void main(String[] args) {
		Phone phone1 = new Phone();
		phone1.setNumber("010-5777-8252");
		
		Phone phone2 = new Phone("010-2321-2655");
		
		Person p = new Person();
		p.setHomePhone(phone1);
		p.setOfficePhone(phone2);
		
		
		System.out.println(p);
	}
}
