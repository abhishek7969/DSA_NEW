package tap.academy;

public class PrimeNumber {
	
	static boolean isPrimeNum(int n) {
		
		for(int i = 2 ; i*i<=n; i++) {
			if( n%i == 0) {
				return false;
			}
			
		}
		
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrimeNum(29));

	}

}
