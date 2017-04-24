package design_pattern.command.after;

public class RobotOnCommand implements Command {
	private Robot robot;

	public RobotOnCommand(Robot robot) {
		this.robot = robot;
	}

	@Override
	public void execute() {
		robot.run();

	}

}
