package design_pattern.factory.before;

public class ElevatorContoller {
	private int id;
	private int curFloor;
	
	public ElevatorContoller(int id) {
		this.id = id;
	}
	
	public void gotoFloor(int destination){
		System.out.printf("Elevator [%d] Floor : %d", id, curFloor);
		curFloor = destination;
		System.out.printf(" ==> %d%n", curFloor);
	}
}
