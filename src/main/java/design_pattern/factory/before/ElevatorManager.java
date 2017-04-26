package design_pattern.factory.before;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
	private List<ElevatorContoller> contollers;
	private ThroughputScheduler scheduler;
	
	public ElevatorManager(int contollerCount) {
		contollers = new ArrayList<>();
		for(int i=0; i<contollerCount; i++){
			contollers.add(new ElevatorContoller(i));
		}
		scheduler = new ThroughputScheduler();		
	}
	
	void requestElevator(int destination, Direction direction){
		int selectElevator = scheduler.selectElevator(this, destination, direction);
		contollers.get(selectElevator).gotoFloor(destination);
	}
	
	
}
