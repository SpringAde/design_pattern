package design_pattern.ch05_strategy;

public class MissileStrategy implements AttackStrategy{

	@Override
	public void attack() {
		System.out.println("I have Missile and can attack with it.");
		
	}

}
