package design_pattern.ch05_strategy;

public class Client {

	public static void main(String[] args) {
		TaekwonV taekwonV = new TaekwonV("태권V");
		Atom atom = new Atom("아톰");
		
		taekwonV.setAttackStrategy(new MissileStrategy());
		taekwonV.setMoveStrategy(new WalkingStrategy());
		
		atom.setAttackStrategy(new PunchStrategy());
		atom.setMoveStrategy(new FlyingStrategy());
		
		prnRobot(taekwonV);
		prnRobot(atom);
	}
	private static void prnRobot(TaekwonV taekwonV) {
		System.out.println("My name is "+taekwonV.getName());
		taekwonV.attack();
		taekwonV.move();
	}
	
	private static void prnRobot(Atom atom) {
		System.out.println("My name is "+atom.getName());
		atom.attack();
		atom.move();		
	}

}
