package design_pattern.observer.after;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<Observer> observers;
	
	public Subject(){
		observers = new ArrayList<>();
	}	
	
	protected void attach(Observer observer){
		observers.add(observer);
	}
	
	protected void detach(Observer observer){
		observers.remove(observer);
	}
	
	protected void notifyObserver(){
		for(Observer observer : observers){
			observer.update();
		}
	}
}
