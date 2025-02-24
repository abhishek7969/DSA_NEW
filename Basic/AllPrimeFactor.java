package tap.academy;

public class AllPrimeFactor {

	static void allPrimeFactor(int n) {
		
		int i = 2;

		while (n > 1) {
			while (n % i == 0) {
				System.out.println(i);
				n = n / i;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		allPrimeFactor(900);

	}

}
