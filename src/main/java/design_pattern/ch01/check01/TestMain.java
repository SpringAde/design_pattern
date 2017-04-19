package design_pattern.ch01.check01;

public class TestMain {
	public static void main(String[] args) {
		Phone phone1 = new Phone();
		phone1.setNumber("010-1212-1212");
		
		Phone phone2 = new Phone("010-1111-2222");
		
		Person p = new Person();
		Phone[] phoneArr = new Phone[2];
		phoneArr[0]=phone1;
		phoneArr[1]=phone2;
		p.setPhones(phoneArr);
		
		System.out.println(p);
		
	}
}
