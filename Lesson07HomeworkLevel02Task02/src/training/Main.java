package training;

public class Main {

	public static void main(String[] args) {

		final String DECIMAL_OUTPUT = "Decimal numbers:";
		final String BINARY_OUTPUT = "Binary numbers:";
		final String DISTANCE_OUTPUT = "Hamming distance: ";		
		int a = -117;
		int b = 19;
		
		System.out.println(DECIMAL_OUTPUT);
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(BINARY_OUTPUT);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));		
		
		//Easy way:		
		System.out.println(DISTANCE_OUTPUT + Integer.bitCount(a ^ b));

		//Hard way:
		System.out.println(DISTANCE_OUTPUT + getHammingDistance(a, b));
		
	}
	
	/**
	 * Calculates Hamming distance between two ints
	 * 
	 * @param a <code>int</code>
	 * @param b <code>int</code>
	 * @return distance
	 * @author Oleg
	 */
	private static int getHammingDistance(int a, int b) {
		
		int xorResult = a ^ b;
		int distance = 0;
		
		for (int i = 0; i < 32; i++) {
			if ((xorResult >> i & 1) == 1) {
				distance++;
			}
		}		
		
		return distance;
	}
}