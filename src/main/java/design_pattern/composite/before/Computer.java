package design_pattern.composite.before;

public class Computer {
	private Body body;
	private Keyboard keyboard;
	private Moniter moniter;
	
	public void addBody(Body body){
		this.body = body;		
	}
	
	public void addKeyboard(Keyboard keyboard){
		this.keyboard = keyboard;		
	}
	
	public void addMoniter(Moniter moniter){
		this.moniter = moniter;		
	}
	
	public int getPrice(){
		int bodyPrice = body.getPrice();
		int keyboardPrice = keyboard.getPrice();
		int moniterPrice = moniter.getPrice();
		return bodyPrice+keyboardPrice+moniterPrice;
	}
	
	public int getPower(){
		int bodyPower = body.getPower();
		int keyboardPower = keyboard.getPower();
		int moniterPower = moniter.getPower();
		return bodyPower+keyboardPower+moniterPower;
	}
}
