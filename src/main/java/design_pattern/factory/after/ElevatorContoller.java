package design_pattern.factory.after;

public class ElevatorContoller {
	private int id;
	private int curFloor;
	
	public ElevatorContoller(int id) {		
		this.id = id;
		this.curFloor = 1;
	}
	
	public void gotoFloor(int destination){
		System.out.printf("Elevator [%d] Floor : %d", id, curFloor);
		curFloor = destination;
		System.out.printf(" ==> %d%n", curFloor);
	}
}
