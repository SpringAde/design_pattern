package design_pattern.ch07_state;

public class Light {	
	private State state;
		
	public Light() {
		state = Off.getInstance();
	}
	public void setState(State state) {
		this.state = state;
	}
	
	public void on_button(){
		state.on_button(this);
	}
	
	public void off_button(){
		state.off_button(this);
	}
	
	
}
