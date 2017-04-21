package design_pattern.singleton.after;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSingletonAfter {

	@Test
	public void testSingletonAfter() {
		User[] user = new User[5];
		
		for(int i=0; i<user.length; i++){
			user[i] = new User((i+1) + "-User");
			user[i].print();
		}
	}

}
