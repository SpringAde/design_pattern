package design_pattern.ch05_strategy;

public class WalkingStrategy implements MoveStrategy{

	@Override
	public void move() {
		System.out.println("I can only walk.");		
	}
}
