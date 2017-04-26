package design_pattern.factory.before;

public class Client {
	public static void main(String[] args) {
		ElevatorManager manager = new ElevatorManager(3);
		for(int i=1 ; i<6; i++){
			manager.requestElevator(i, Direction.DOWN);
		}
		
	}

}
