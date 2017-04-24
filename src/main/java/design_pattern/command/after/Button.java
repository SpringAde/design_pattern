package design_pattern.command.after;

public class Button {
	private Command theCommand;

	public Button(Command theCommand) {
		this.theCommand = theCommand;
	}

	public void setTheCommand(Command theCommand) {
		this.theCommand = theCommand;
	}
	
	public void pressed(){	// 버튼이 눌러지면 Command의 execute()호출
		theCommand.execute();
	}
	
	
}
