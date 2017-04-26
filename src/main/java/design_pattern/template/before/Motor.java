package design_pattern.template.before;

public abstract class Motor {
	protected Door door;
	private MotorStatus motorStatus;
	
	public Motor(Door door) {
		this.door = door;
		this.motorStatus = MotorStatus.STOPPED;		
	}

	public MotorStatus getMotorStatus() {
		return motorStatus;
	}

	protected void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}	
	
	public void move(Direction direction){	// template method
		MotorStatus motorStatus = getMotorStatus();
		if(motorStatus == motorStatus.MOVING)
			return;
		DoorStatus doorStatus = door.getDoorStatus();
		if(doorStatus == DoorStatus.OPENED){
			door.close();
		}
		
		moveMotor(direction);	//hook method : 하위에서 오버라이딩
		setMotorStatus(MotorStatus.MOVING);
	}
	
	private void moveMotor(Direction direction) {
		setMotorStatus(MotorStatus.MOVING);
		
	}

	@Override
	public String toString() {
		String motorStatus = getMotorStatus() == MotorStatus.MOVING? "이동 중":"중지";
		String doorStatus = door.getDoorStatus() == DoorStatus.OPENED? "문 열림":"문 닫힘";
		
		return String.format("모터 상태 : %s, 문의 상태 : %s, %n", motorStatus, doorStatus);
	}	
	
}
