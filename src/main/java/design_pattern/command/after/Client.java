package design_pattern.command.after;

public class Client {
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Command lampOnCommand = new LampOnCommand(lamp);
		Button btn = new Button(lampOnCommand);
		btn.pressed();
		
		Alarm alarm = new Alarm();
		Command alarmOnCommand = new AlarmOnCommand(alarm);
		btn.setTheCommand(alarmOnCommand);
		btn.pressed();
		
		Robot robot = new Robot();
		Command robotOnCommand = new RobotOnCommand(robot);
		btn.setTheCommand(robotOnCommand);
		btn.pressed();
		
	}
}
