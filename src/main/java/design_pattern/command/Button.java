package design_pattern.command;

public class Button {
	private Lamp theLamp;
	private Alarm theAlarm;
	private Mode theMode;
	
	public Button(Lamp theLamp, Alarm theAlarm) {
		this.theLamp = theLamp;
		this.theAlarm = theAlarm;
	}

	public void setTheMode(Mode theMode) {
		this.theMode = theMode;
	}
	
	public void pressed(){
		switch(theMode){
		case LAMP :
			theLamp.turnOn();
			break;
		case ALARM : 
			theAlarm.start();
			break;
		}
	}
	
	
	
}
