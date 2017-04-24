package design_pattern.ch06_singleton;

import design_pattern.singleton.after.User;

public class UsingPrint {
	private static final int USER_NUM = 5;

	public static void main(String[] args) {
		User[] user = new User[USER_NUM];
		for(int i=0 ; i<user.length ; i++){
			user[i] = new User((i+1)+"-user :");		//User 객체 생성
			user[i].print();
		}

	}
}


