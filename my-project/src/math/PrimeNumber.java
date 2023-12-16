package math;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 100;
		for (int i = 1; i < n; i++) {
			
			if(isPrime(i)) {
				System.out.print(i + " , "  );
			}
		}
	}

	// prime number prog
	static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}

		int c = 2;
		while (c * c <= num) {
			if (num % c == 0) {
				return false;
			}
			c++;
		}

		return true;
	}
	
	//BigInteger biN = new BigInteger(n);
    //if (biN.isProbablePrime(1)) System.out.println("prime");
   // else System.out.println("not prime");  

}