package tap.academy;

public class Factorial {

	static int fact(int n) {
		int res = 1;

		for (int i = 1; i <= n; i++) {
			res = res * i;
		}

		return res;
	}

	public static void main(String[] args) {
		System.out.println(fact(12));

	}

}
