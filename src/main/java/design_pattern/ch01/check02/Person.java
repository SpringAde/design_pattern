package design_pattern.ch01.check02;

public class Person {
	private Phone homePhone;
	private Phone officePhone;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(Phone homePhone, Phone officePhone) {
		this.homePhone = homePhone;
		this.officePhone = officePhone;
	}

	public Phone getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(Phone homePhone) {
		this.homePhone = homePhone;
	}

	public Phone getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(Phone officePhone) {
		this.officePhone = officePhone;
	}

	@Override
	public String toString() {
		return String.format("Person [homePhone=%s, officePhone=%s]", homePhone, officePhone);
	}
}
