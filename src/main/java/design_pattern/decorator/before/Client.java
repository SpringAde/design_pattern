package design_pattern.decorator.before;

public class Client {
	public static void main(String[] args) {
		RoadDisplay roadDisplay = new RoadDisplay();
		roadDisplay.drow();		
		
		RoadDisplayWithLane roadDisplayWithLane = new RoadDisplayWithLane();
		roadDisplayWithLane.draw();
	}
}
