package design_pattern.ch09_observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	//추상화된 통보 대상 목록
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer observer){ // 통보 대상 추가
		observers.add(observer);
	}
	
	public void detach(Observer observer){	// 통보 대상 제거
		observers.remove(observer);
	}
	
	public void notifyObserver(){	// 각각의 통보대상(옵저버)에게 변경 통보
		for(Observer o : observers){
			o.update();
		}
	}
}
