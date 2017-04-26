package design_pattern.factory.before;

public class ThroughputScheduler {
	public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
		return (int)(Math.random()*3);
	}
}
