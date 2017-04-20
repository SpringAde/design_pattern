package design_pattern.strategy;

public abstract class Robot {
	private String name;

	public Robot(String name) {			// 매개변수가 있는 생성자
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public abstract void attack();
	public abstract void move();	
}
