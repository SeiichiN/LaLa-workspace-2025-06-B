package main;

import java.util.Random;

public class Com extends Player {
	
	public Com() {
		this.name = "コム";
	}

	@Override
	void setHand() {
		this.hand = new Random().nextInt(3);
	}

}
