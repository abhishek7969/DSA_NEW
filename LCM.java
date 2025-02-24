package tap.academy;

public class LCM {

	static int lcm(int a, int b, int c) {

		int res1 = Math.max(a, b);
		int res = Math.max(c, res1);

		while (true) {
			if (res % a == 0 && res % b == 0 && res % c == 0) {
				break;
			}
			res++;
		}

		return res;
	}

	public static void main(String[] args) {
		System.out.println(lcm(12, 15, 75));

	}

}
