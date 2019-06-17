package training;

public class Main {

	public static void main(String[] args) {

		final String OUTPUT_MESSAGE_HEAD = "Prime numbers (";
		final String OUTPUT_MESSAGE_TAIL = "):";
		final int RANGE_MIN = 2;
		final int RANGE_MAX = 100;
		long maxDivisor;
		boolean isPrime;
		
		System.out.println(OUTPUT_MESSAGE_HEAD + RANGE_MIN + " - " + RANGE_MAX 
				+ OUTPUT_MESSAGE_TAIL);
		
		for (int i = RANGE_MIN; i <= RANGE_MAX; i++) {
			maxDivisor = Math.round(Math.sqrt(i));
			isPrime = true;
			
			for (int j = 2; j <= maxDivisor; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
//		Alternative solution
		int[] sieve = new int[99];
		
		for (int i = 0; i < sieve.length; i++) {
			sieve[i] = i + 2;
		}
		
		for (int i = 0; i < sieve.length; i++) {		
			if (sieve[i] != 0) {					
				for (int j = i + sieve[i]; j < sieve.length; j += sieve[i]) {
					sieve[j] = 0;
				}
			}			
		}
		
		for (int i = 0; i < sieve.length; i++) {
			if (sieve[i] != 0) {
				System.out.print(sieve[i] + " ");
			}
		}		
	}
}