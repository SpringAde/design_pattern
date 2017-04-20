package design_pattern.strategy;

import org.junit.Test;

import design_pattern.strategy.attack.RazerStrategy;
import design_pattern.strategy.attack.MissileStrategy;
import design_pattern.strategy.attack.PunchStrategy;
import design_pattern.strategy.move.FlyingStrategy;
import design_pattern.strategy.move.MoveStrategy;
import design_pattern.strategy.move.WalkingStrategy;

public class TestStrategy {

	@Test
	public void test() {
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Atom");
		Robot sungard = new Sungard("Sungard");
		
		taekwonV.setMoveStrategy(new WalkingStrategy());
		taekwonV.setAttackStrategy(new MissileStrategy());
				
		atom.setMoveStrategy(new FlyingStrategy());
		atom.setAttackStrategy(new MissileStrategy());
		
		sungard.setMoveStrategy(new FlyingStrategy());
		sungard.setAttackStrategy(new MissileStrategy());
		sungard.setAttackStrategy(new RazerStrategy());
		
		
		prnRobot(taekwonV);
		prnRobot(atom);
		prnRobot(sungard);
		
	}

	private void prnRobot(Robot robot) {
		System.out.printf("My name is %s%n", robot.getName());
		robot.move();
		robot.attack();
		
	}

}
