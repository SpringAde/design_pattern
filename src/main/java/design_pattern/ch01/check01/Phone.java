package design_pattern.ch01.check01;

public class Phone {
	private String number;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public Phone(String number) {
		this.number = number;
	}
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return String.format("Phone [number=%s]", number);
	}
	
}
