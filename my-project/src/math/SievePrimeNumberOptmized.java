package math;

public class SievePrimeNumberOptmized {

	//print all the prime numbers upto the given number
	//2  3  5  7  11  13  17  19  23  29  31  37 
	public static void main(String[] args) {
		int n = 40;
		boolean [] primes = new boolean[n+1];
		sieve(n, primes);
	}
	
	
	static void sieve (int n, boolean [] primes) {
		
		for(int i =2 ; i*i <= n; i++) {
			if(!primes[i]) {
				for (int j = i*2; j <= n; j+=i) {
					primes[j]=true;
					
				}
			}
		}
		
		for (int i = 2; i <= n; i++) {
			if(!primes[i]) {
				System.out.println(i +" ");
			}
		}
		
	}
	
	
	
	
	
	
	
}
