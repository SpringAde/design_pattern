package design_pattern.command.before;

public class Client {
	public static void main(String[] args) {
		Lamp theLamp = new Lamp();
		Alarm theAlarm = new Alarm();
		
		Button button = new Button(theLamp, theAlarm);
		
		button.setTheMode(Mode.LAMP);
		button.pressed();
		
		button.setTheMode(Mode.ALARM);
		button.pressed();
	}
}
