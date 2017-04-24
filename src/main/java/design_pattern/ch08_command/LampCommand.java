package design_pattern.ch08_command;

public class LampCommand implements Command {
	private Lamp theLamp;	
	
	public LampCommand(Lamp theLamp) {
		this.theLamp = theLamp;
	}

	@Override
	public void execute() {
		theLamp.turnOn();

	}

}
