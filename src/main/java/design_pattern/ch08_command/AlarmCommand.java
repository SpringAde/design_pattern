package design_pattern.ch08_command;

public class AlarmCommand implements Command {
	private Alarm theAlarm;
	
	public AlarmCommand(Alarm theAlarm) {
		this.theAlarm = theAlarm;
	}

	@Override
	public void execute() {
		theAlarm.bell();
	}

}
