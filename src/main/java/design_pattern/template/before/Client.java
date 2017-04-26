package design_pattern.template.before;

public class Client {
	public static void main(String[] args) {
		Door hDoor = new Door();
		HyundaiMotor hMotor = new HyundaiMotor(hDoor);	
		
		System.out.println(hMotor);
		hMotor.move(Direction.UP);
		System.out.println();
		System.out.println(hMotor);
		
		
		Door lDoor = new Door();
		LgMotor lgMotor = new LgMotor(lDoor);
		
		System.out.println(lgMotor);
		lgMotor.move(Direction.UP);
		System.out.println();
		System.out.println(lgMotor);		
		
	}
}
