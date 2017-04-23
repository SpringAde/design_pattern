package design_pattern.ch05_strategy;

public class FlyingStrategy implements MoveStrategy {

	@Override
	public void move() {
		System.out.println("I can fly.");
		
	}

}
