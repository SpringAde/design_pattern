package design_pattern.factory.after;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import design_pattern.factory.before.ThroughputScheduler;

public class ElevatorManager {
	private List<ElevatorContoller> contollers;
	private SchedulingStrategyID strategyID;
	
	public ElevatorManager(int contollerCount, SchedulingStrategyID strategyID) {
		contollers = new ArrayList<>();
		for(int i=0; i<contollerCount; i++){
			contollers.add(new ElevatorContoller(i));
		}
		this.strategyID = strategyID;	// 스케줄링 전략을 설정	
	}
	
	void requestElevator(int destination, Direction direction){
		ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyID);
		System.out.println(scheduler);
		int selectElevator = scheduler.selectElevator(this, destination, direction);
		contollers.get(selectElevator).gotoFloor(destination);
	}
	
}
