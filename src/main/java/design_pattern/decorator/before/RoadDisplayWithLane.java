package design_pattern.decorator.before;

public class RoadDisplayWithLane extends RoadDisplay {
	
	public void draw(){
		super.drow(); // 상위클래스의 draw()호출
		drawLane();	// 하위클래스의 추가적 차선을 표시
	}

	private void drawLane() {
		System.out.println("차선표시");
		
	}
}
