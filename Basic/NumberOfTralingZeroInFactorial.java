package tap.academy;

public class NumberOfTralingZeroInFactorial {

	static int numOfZeroInFact(int n) {
		int powOfFive = 5;
		int result = 0;
		
		while(n >= powOfFive) {
			result = result + (n/powOfFive);
			powOfFive = powOfFive * 5;
		}
		
		return result;		
	}
	
	public static void main(String[] args) {
		System.out.println(numOfZeroInFact(12));

	}

}
