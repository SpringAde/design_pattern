package design_pattern.state.after;

public class Light {
	private State state;

	public Light() {
	state = Off.getInstance();
	}
	//상태가 변경되어야 함으로 필요하다.
	public void setState(State state) {
		this.state = state;
	}

	public void on_button_pushed(){
		state.on_button_pushed(this);		//위임(일부 기능을 재사용)
	}

	public void off_button_pushed(){
		state.off_button_pushed(this);		//위임(일부 기능을 재사용)
	}

}
