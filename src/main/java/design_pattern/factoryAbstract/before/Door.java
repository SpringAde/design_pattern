package design_pattern.factoryAbstract.before;

public abstract class Door {
	private DoorStatus doorStatus;

	public Door() {
		this.doorStatus = DoorStatus.CLOSED;
	}

	public DoorStatus getDoorStatus() {
		return doorStatus;
	}
	
	
	
	public void close(){	//template method
		if(this.doorStatus == DoorStatus.CLOSED) return;
		doClose();		//hook method
		this.doorStatus = DoorStatus.CLOSED;
	}
	protected abstract void doClose();
	
	
	
	public void open(){		//template method
		if(this.doorStatus == DoorStatus.OPENED) return;
		doOpen();		//hook method
		this.doorStatus = DoorStatus.OPENED;
	}
	protected abstract void doOpen();
}
