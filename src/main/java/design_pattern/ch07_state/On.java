package design_pattern.ch07_state;

public class On implements State {
	
	private static final On instance = new On();
	private On() {	}
	public static On getInstance() {	return instance;	}

	@Override
	public void on_button(Light light) {
		System.out.println("반응 없음");
		
	}

	@Override
	public void off_button(Light light) {
		System.out.println("Light Off");
		light.setState(Off.getInstance());
	}

}
