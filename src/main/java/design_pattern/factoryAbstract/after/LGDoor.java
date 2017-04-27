package design_pattern.factoryAbstract.after;

public class LGDoor extends Door {

	@Override
	protected void doClose() {
		System.out.printf("Close %s Door %n", "LG");
	}

	@Override
	protected void doOpen() {
		System.out.printf("Open %s Door %n", "LG");
	}

}
