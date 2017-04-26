package design_pattern.template.before;

public class Door {
	private DoorStatus doorStatus;

	public Door() {
		doorStatus = DoorStatus.CLOSED;
	}

	public DoorStatus getDoorStatus() {
		return doorStatus;
	}
	
	public void open(){
		doorStatus = DoorStatus.OPENED;
	}
	
	public void close(){
		doorStatus = DoorStatus.CLOSED;
	}
	
	
}
