package design_pattern.strategy;

import design_pattern.strategy.attack.AttackStrategy;
import design_pattern.strategy.move.MoveStrategy;

public abstract class Robot {
	private String name;	
	private MoveStrategy moveStrategy;
	private AttackStrategy attackStrategy;
	

	public Robot(String name) {			// 매개변수가 있는 생성자
		this.name = name;
	}
	public String getName() {
		return name;
	}	
	
	//private MoveStrategy moveStrategy;
	public void setMoveStrategy(MoveStrategy moveStrategy) {		
		this.moveStrategy = moveStrategy;
	}
	//private AttackStrategy attackStrategy;
	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}
		
	
	public void move(){
		moveStrategy.move();
	}
	public void attack(){
		attackStrategy.attack();
	}
	
}
