package design_pattern.factoryAbstract.after;

public class SamsungElevatorFactory extends ElevatorFactory {
	
	private static final SamsungElevatorFactory instance = new SamsungElevatorFactory();
	private SamsungElevatorFactory() {}
		public static SamsungElevatorFactory getInstance() {
		return instance;
	}

	@Override
	public Motor createMotor() {
		return new SamsungMotor();
	}

	@Override
	public Door createDoor() {
		return new SamsungDoor();
	}
}
