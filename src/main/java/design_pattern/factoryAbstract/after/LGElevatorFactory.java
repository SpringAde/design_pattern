package design_pattern.factoryAbstract.after;

public class LGElevatorFactory extends ElevatorFactory {
	
	private static final LGElevatorFactory instance = new LGElevatorFactory();
	private LGElevatorFactory() {}
	public static LGElevatorFactory getInstance() {
		return instance;
	}


	@Override
	public Motor createMotor() {
		return new LGMotor();
	}

	@Override
	public Door createDoor() {
		return new LGDoor();
	}

}
