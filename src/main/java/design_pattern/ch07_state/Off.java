package design_pattern.ch07_state;

public class Off implements State {
	
	private static final Off instance = new Off();	
	private Off() {	}		
	public static Off getInstance() {
		return instance;
	}
	@Override
	public void on_button(Light light) {
		System.out.println("Light On");
		light.setState(On.getInstance());
	}
	@Override
	public void off_button(Light light) {
		System.out.println("반응 없음");
		
	}
	
}
