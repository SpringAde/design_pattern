package design_pattern.ch01.check01;

import java.util.Arrays;

public class Person {
	private Phone[] phones;

	public Person() {
		phones = new Phone[2];
	}

	public Phone[] getPhones() {
		return phones;
	}

	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return String.format("Person [phones=%s]", Arrays.toString(phones));
	}	
}
