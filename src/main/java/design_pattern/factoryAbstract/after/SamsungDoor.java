package design_pattern.factoryAbstract.after;

public class SamsungDoor extends Door {

	@Override
	protected void doClose() {
		System.out.printf("Close %s Door %n", "Samsung");
	}

	@Override
	protected void doOpen() {
		System.out.printf("Open %s Door %n", "Samsung");
	}

}
