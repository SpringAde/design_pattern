package design_pattern.ch05_strategy;

public class PunchStrategy implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("I have vey strong punch and can attack with it.");

	}

}
