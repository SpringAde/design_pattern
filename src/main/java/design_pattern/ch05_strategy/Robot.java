package design_pattern.ch05_strategy;

public abstract class Robot {
	private String name;
	private AttackStrategy attackStrategy;
	private MoveStrategy moveStrategy;
	
	public Robot(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}

	public void setMoveStrategy(MoveStrategy moveStrategy) {
		this.moveStrategy = moveStrategy;
	}

	public void attack(){
		attackStrategy.attack();
	}
	
	public void move(){
		moveStrategy.move();
	}
	
	

	
	
	
}
