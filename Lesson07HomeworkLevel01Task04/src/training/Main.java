package training;

public class Main {

	public static void main(String[] args) {

		printPI();
	}
	
	/**
	 * Prints 10 rows of PI with increasing amount of decimal places
	 * 
	 * @author Oleg
	 */
	private static void printPI() {		
		
		final int ITERATIONS = 10;
		String pi;
		
		for (int i = 0; i < ITERATIONS; i++) {
			pi = String.format("%." + (i + 2) + "f", Math.PI); 
			System.out.println(pi);
		}
	}
}