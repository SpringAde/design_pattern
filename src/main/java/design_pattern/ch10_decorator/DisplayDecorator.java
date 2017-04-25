package design_pattern.ch10_decorator;

public abstract class DisplayDecorator extends Display {
	private Display decoratedDisplay;
	
	public DisplayDecorator(Display decoratedDisplay) {
		this.decoratedDisplay = decoratedDisplay;
	}

	@Override
	public void draw() {
		decoratedDisplay.draw();

	}

}
