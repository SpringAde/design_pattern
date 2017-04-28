package design_pattern.factoryAbstract.after;

public class ClientMotor {
	
	public static void main(String[] args) {
		ElevatorFactory factory = null;		
		String vendorName = String.valueOf(VendorID.LG);		
		VendorID vendorID = null;
		
		if(vendorName.equalsIgnoreCase("LG")){
			vendorID = VendorID.LG;
		}else if(vendorName.equalsIgnoreCase("Samsung")){
			vendorID = VendorID.SAMSUNG;
		}else{
			vendorID = VendorID.HYUNDAI;
		}
		
		//*******************************************************//
		
		ElevatorFactory factoryMotor = null;		
		
		String vendorNameMotor = String.valueOf(VendorID.SAMSUNG);		
		VendorID vendorIDMotor = null;
		
		if(vendorNameMotor.equalsIgnoreCase("LG")){
			vendorIDMotor = VendorID.LG;
		}else if(vendorNameMotor.equalsIgnoreCase("Samsung")){
			vendorIDMotor = VendorID.SAMSUNG;
		}else{
			vendorIDMotor = VendorID.HYUNDAI;
		}
			
		
		
		factory = ElevatorFactoryFactory.getFactory(vendorID);
		factoryMotor = ElevatorFactoryFactory.getFactory(vendorIDMotor);
		
		
		Door door = factory.createDoor();
		Motor motor = factoryMotor.createMotor();
		motor.setDoor(door);
		
		door.open();
		motor.move(Direction.UP);
		
		
	}

}
