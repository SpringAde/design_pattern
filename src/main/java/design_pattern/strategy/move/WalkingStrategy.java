package design_pattern.strategy.move;

public class WalkingStrategy implements MoveStrategy {

	@Override
	public void move() {
		System.out.println("I can only walk.");
	}

}
