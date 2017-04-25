package design_pattern.ch08_command;

public class User {
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Command lampOnCommand = new LampCommand(lamp);
		Button btn = new Button(lampOnCommand);
		btn.pressed();
		
		Alarm alarm = new Alarm();
		Command alarmOnCommand = new AlarmCommand(alarm);
		btn.setCommand(alarmOnCommand);
		btn.pressed();
		
	}	
}
