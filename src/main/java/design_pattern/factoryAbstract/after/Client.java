package design_pattern.factoryAbstract.after;

public class Client {
	
	public static void main(String[] args) {
		ElevatorFactory factory = null;
		String vendorName = String.valueOf(VendorID.HYUNDAI);
		VendorID vendorID = null;
		
		if(vendorName.equalsIgnoreCase("LG")){
			vendorID = VendorID.LG;
		}else if(vendorName.equalsIgnoreCase("Samsung")){
			vendorID = VendorID.SAMSUNG;
		}else{
			vendorID = VendorID.HYUNDAI;
		}
		
		factory = ElevatorFactoryFactory.getFactory(vendorID);
		
		Door door = factory.createDoor();
		Motor motor = factory.createMotor();
		motor.setDoor(door);
		
		door.open();
		motor.move(Direction.UP);
		
	}

}
