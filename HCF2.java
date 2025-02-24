package tap.academy;

public class HCF2 {

	static int hcf_euclid(int a, int b) {

		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		System.out.println(hcf_euclid(51, 17));
	}

}
