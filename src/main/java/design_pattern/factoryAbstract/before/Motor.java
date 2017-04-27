package design_pattern.factoryAbstract.before;

public abstract class Motor {
	private MotorStatus motorStatus;
	private Door door;
	
	public Motor() {
		this.motorStatus = MotorStatus.STOP;
	}
	public void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}
	public void setDoor(Door door) {
		this.door = door;
	}
	
	public void move(Direction direction){
		if(motorStatus == motorStatus.MOVE) return;
		if(door.getDoorStatus() == DoorStatus.OPENED){
			door.close();
		}
		moveMotor(direction);
		motorStatus = MotorStatus.MOVE;
	}
	
	protected abstract void moveMotor(Direction direction);
	
}
