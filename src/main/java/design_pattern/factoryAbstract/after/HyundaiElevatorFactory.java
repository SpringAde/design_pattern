package design_pattern.factoryAbstract.after;

public class HyundaiElevatorFactory extends ElevatorFactory {
	
	private static final HyundaiElevatorFactory instance = new HyundaiElevatorFactory();
	private HyundaiElevatorFactory() {}
	public static HyundaiElevatorFactory getInstance() {
		return instance;
	}


	@Override
	public Motor createMotor() {
		return new HyundaiMotor();
	}

	@Override
	public Door createDoor() {
		return new HyundaiDoor();
	}

}
