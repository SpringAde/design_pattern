package design_pattern.factoryAbstract.before;

public class HyundaiDoor extends Door {

	@Override
	protected void doClose() {
		System.out.printf("Close %s Door %n", "HYUNDAI");
	}

	@Override
	protected void doOpen() {
		System.out.printf("Open %s Door %n", "HYUNDAI");
	}

}
