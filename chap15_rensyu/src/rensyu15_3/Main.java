package rensyu15_3;

public class Main {

	public static void main(String[] args) {
		String pattern1 = ".*";
		// check(pattern1);
		String pattern2 = "A[0-9][0-9]?";  // "A[0-9][0-9]{0,1}"
		// check(pattern2);
		String pattern3 = "U[A-Z]{3}";
		check(pattern3);
	}
	
	public static void check(String p) {
		String str = "UEDT";
		if (str.matches(p)) {
			System.out.println("マッチしました");
		} else {
			System.out.println("マッチしません");
		}
	}

}
