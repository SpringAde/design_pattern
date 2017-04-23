package design_pattern.singleton.before;

import static org.junit.Assert.*;

import org.junit.Test;

import design_pattern.singleton.before.User;

public class TestSingleton {

	@Test
	public void testSingletonBefore() {
		User[] user = new User[5];
		
		for(int i=0; i<user.length; i++){
			user[i] = new User((i+1) + "-User");
			user[i].print();
		}
	}

}
