package design_pattern.factoryAbstract.after;

public class MotorFactory {
	public static Motor createMotor(VendorID vendorID){
		
		Motor motor = null;
		
		switch(vendorID){
		case LG:
			motor = new LGMotor();
			break;
		case HYUNDAI:
			motor = new HyundaiMotor();
			break;
		}
		return motor;
	}
}
