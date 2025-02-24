package tap.academy;

public class HCF1 {

	static int hfc(int a, int b) {

		int min = 0;
		if (a > b) {
			min = b;
		} else {
			min = a;
		}

		for (int i = min; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		System.out.println(hfc(20, 15));

	}

}
