package design_pattern.template.before;

public class HyundaiMotor extends Motor {	
	
	public HyundaiMotor(Door door) {
		super(door);	
	}
	@Override
	public void move(Direction direction){		
			String strDirection = direction == Direction.UP? "위로" : "아래로";
		System.out.printf("현대 모터 %s 이동 중...", strDirection);		
	}
	
}
