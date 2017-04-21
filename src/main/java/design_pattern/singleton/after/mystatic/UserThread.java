package design_pattern.singleton.after.mystatic;

public class UserThread extends Thread {
	public UserThread(String name){	//스레드생성
		super(name);
	}
	
	public void run(){
		Printer.print(Thread.currentThread().getName()+" print using");
	}
}
