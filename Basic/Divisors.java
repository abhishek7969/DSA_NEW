package tap.academy;

public class Divisors {

	static void printAllDivisor(int n) {

		for (int i = 1; i * i <= n; i++) {
			
			if (n % i == 0) {
				System.out.println(i);
				if (i != n / i) {
					System.out.println(n / i);
				}
			}
			
		}

	}

	static void printAllDivisorInOrder(int n) {

		int j = 0;
		
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
			j = i;
		}

		for (; j >= 1; j--) {
			if (n % j == 0 && j != n / j) {
				System.out.println(n / j);
			}
		}
		
	}

	public static void main(String[] args) {
		printAllDivisor(25);
		System.out.println("***********************");
		printAllDivisorInOrder(25);

	}

}
