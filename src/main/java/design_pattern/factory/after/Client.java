package design_pattern.factory.after;

public class Client {

	public static void main(String[] args) {
		ElevatorManager emWithResponseTimeScheduler = new ElevatorManager(3, SchedulingStrategyID.RESPONSE_TIME);
		emWithResponseTimeScheduler.requestElevator(10, Direction.UP);
		
		ElevatorManager emWithThroughputScheduler = new ElevatorManager(3, SchedulingStrategyID.THROUGHPUT);
		emWithThroughputScheduler.requestElevator(10, Direction.UP);		
		
		
		ElevatorManager emWithDynamicScheduler = new ElevatorManager(3, SchedulingStrategyID.DYNAMIC);
		emWithDynamicScheduler.requestElevator(10, Direction.UP);
		
		ElevatorManager emWithThroughputScheduler2 = new ElevatorManager(3, SchedulingStrategyID.THROUGHPUT);
		emWithThroughputScheduler2.requestElevator(10, Direction.UP);
		
	}

}
