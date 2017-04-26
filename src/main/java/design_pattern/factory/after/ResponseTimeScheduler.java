package design_pattern.factory.after;

public class ResponseTimeScheduler implements ElevatorScheduler {
	
	private static final ResponseTimeScheduler instance = new ResponseTimeScheduler();
	private ResponseTimeScheduler() {	}
	public static ResponseTimeScheduler getInstance() {
		return instance;
	}

	@Override
	public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
		return 2;
	}

	@Override
	public String toString() {
		return String.format("ResponseTimeScheduler : " + Integer.toHexString(hashCode()));
	}
	
	
}
