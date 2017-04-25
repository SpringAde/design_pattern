package design_pattern.ch07_state;

public class User {
	public static void main(String[] args) {
		Light light = new Light();
		light.off_button();
		light.on_button();
		light.on_button();
		light.off_button();
	}
}
