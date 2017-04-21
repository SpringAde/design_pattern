package design_pattern.singleton.after.thread;

import org.junit.Test;

public class TestSingletonThread {

	@Test
	public void testSingletonThread() {
		UserThread[] user = new UserThread[5];
		
		for(int i=0; i<user.length; i++){
			user[i] = new UserThread((i+1) + "-User");
			user[i].start();
		}
	}

}
