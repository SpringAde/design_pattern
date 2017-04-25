package design_pattern.ch10_decorator;

public class User {
	public static void main(String[] args) {
		Display display = new RoadDisplay();
		display.draw();
		
		Display roadWithLane = new LaneDecorator(new RoadDisplay());
		roadWithLane.draw();
		
		Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
		roadWithTraffic.draw();
		
		System.out.println("=================================");
		
		Display roadWithLaneWithTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
		roadWithLaneWithTraffic.draw();
	}
}
