package rensyu1;

public class Account {
	String accountNumber;
	int balance;
	
	@Override
	public String toString() {
		return "￥" + balance + "(口座番号:" + accountNumber + ")";
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o instanceof Account a) {
			String a1 = this.accountNumber.trim();
			String a2 = a.accountNumber.trim();
			if (a1.equals(a2)) {
				return true;
			}
		}
		return false;
	}
}
