package design_pattern.composite.before;

public class Client {
	public static void main(String[] args) {
		// 컴퓨터 부품으로 body, keyboard, monitor 객체 생성
		Body body = new Body(100, 70);
		Keyboard keyboard = new Keyboard(5, 2);
		Moniter moniter = new Moniter(20, 30);
		
		// 컴퓨터 객체를 생성하고 부품 객체들을 설정
		Computer computer = new Computer();
		computer.addBody(body);
		computer.addKeyboard(keyboard);
		computer.addMoniter(moniter);
		
		// 컴퓨터의 가격과 전력 소비량을 구함
		int computerPrice = computer.getPrice();
		int computerPower = computer.getPower();
		
				System.out.println("Computer Power : "+computerPower + "W");
		System.out.println("Computer Price : "+computerPrice +"만원");
	}
}
