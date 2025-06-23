package main;

public class Main {

	public static void main(String[] args) {
		Com com = new Com();
		User user = new User();
		com.setHand();
		user.setHand();
		com.judge(user);
		user.judge(com);
		com.showResult();
		user.showResult();
	}

}
