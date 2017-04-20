package design_pattern.strategy.move;

public class FlyingStrategy implements MoveStrategy {

	@Override
	public void move() {
		System.out.println("I can fly.");
	}

}
