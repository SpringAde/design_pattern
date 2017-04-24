package design_pattern.state.before;

public class Light {
	private static final int ON = 0;	//형광등이 켜진 상태
	private static final int OFF = 1;	//형광등이 꺼진 상태
	private static final int SLEEPING = 2;	//취침등 상태 추가
	private int state;		// 형광등의 현재 상태
	public Light() {
		state = Light.OFF;	// 초기화
	}
	
	public void on_button_pushed(){
		if(state == Light.ON){
			System.out.println("취침모드");
			state = Light.SLEEPING;
		}else if(state == SLEEPING){
			System.out.println("Light ON");
			state = Light.ON;
		}else{
			System.out.println("Light ON");
			state = Light.ON;
		}
	}
	
	public void off_button_pushed(){
		if(state == Light.OFF){
			System.out.println("반응없음");
		}else if(state==Light.SLEEPING){
			System.out.println("Light ON");
		}else{
			System.out.println("Light OFF");
			state = Light.OFF;
		}
	}
}
