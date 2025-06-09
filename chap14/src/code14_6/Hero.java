package code14_6;

public class Hero {
	String name;
	int hp;
	
	@Override
	public String toString() {
		return "名前：" + name + "／HP：" + hp;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o instanceof Hero h) {
			if (this.name.equals(h.name )) {
				return true;
			}
		}
		return false;
	}
	
	
}
