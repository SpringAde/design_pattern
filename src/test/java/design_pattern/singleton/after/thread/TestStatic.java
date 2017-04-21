package design_pattern.singleton.after.thread;

import org.junit.Test;
import design_pattern.singleton.after.mystatic.UserThread;

public class TestStatic {

	private static final int THREAD_NUM=5;
	
	@Test
	public void test() {
		UserThread[] user = new UserThread[THREAD_NUM];
		for(int i=0; i<THREAD_NUM; i++){
			user[i] = new UserThread((i+1)+"-Static thread");
			user[i].start();
		}
	}

}
