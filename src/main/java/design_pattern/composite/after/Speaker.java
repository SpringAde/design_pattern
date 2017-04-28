package design_pattern.composite.after;

public class Speaker extends ComputerDevice {
	private int price;
	private int power;
	
	public Speaker(int power, int price) {		
		this.power = power;
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return price;
	}
	
	@Override
	public int getPower() {
		return power;
	}
	
	
}
