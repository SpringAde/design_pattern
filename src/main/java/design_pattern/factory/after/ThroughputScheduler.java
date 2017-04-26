package design_pattern.factory.after;

public class ThroughputScheduler implements ElevatorScheduler {
	
	private static final ThroughputScheduler instance = new ThroughputScheduler();
	private ThroughputScheduler() {}
	public static ThroughputScheduler getInstance() {
		return instance;
	}

	@Override
	public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
		return (int)(Math.random()*3);
	}

	@Override
	public String toString() {
		return String.format("ThroughputScheduler : " + Integer.toHexString(hashCode()));
	}
	
	
}
