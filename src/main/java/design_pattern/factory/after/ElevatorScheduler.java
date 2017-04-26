package design_pattern.factory.after;

public interface ElevatorScheduler {
	public int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
