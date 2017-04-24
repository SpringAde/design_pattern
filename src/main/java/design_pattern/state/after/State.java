package design_pattern.state.after;

public interface State {
	void on_button_pushed(Light light);		// 일부 기능을 재사용할 때는 위임을 사용하라!
	void off_button_pushed(Light light);
}
