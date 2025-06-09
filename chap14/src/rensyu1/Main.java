package rensyu1;

public class Main {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.accountNumber = " 4649";
		a1.balance = 1592;
		Account a2 = new Account();
		a2.accountNumber = "4649 ";
		a2.balance = 1600;
		if (a1.equals(a2)) {
			System.out.println("同じ口座です");
		} else {
			System.out.println("違います");
		}

	}

}
