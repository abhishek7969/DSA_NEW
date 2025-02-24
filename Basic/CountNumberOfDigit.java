package tap.academy;

public class CountNumberOfDigit {

	static int countDigit(int n) {
		int count = 0;
		while(n >0) {
			n = n/10;
			count = count+1;
		}
		return count;
		
	}
	public static void main(String[] args) {
		System.out.println(countDigit(123456789));
	}

}
