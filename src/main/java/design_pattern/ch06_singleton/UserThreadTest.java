package design_pattern.ch06_singleton;

public class UserThreadTest {
	public static void main(String[] args) {
		UserThread[] userThread = new UserThread[5];
		
		for(int i=0; i<userThread.length; i++){
			userThread[i] = new UserThread((i+1)+"-userThread");
			userThread[i].start();
		}
		
	}
}
