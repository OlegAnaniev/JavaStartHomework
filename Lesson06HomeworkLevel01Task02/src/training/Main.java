package training;

public class Main {

	public static void main(String[] args) {
		final int INT = 10;
		final double DOUBLE = 12.5;
		final String STRING = "Some text";
		String result = concatenate(INT, DOUBLE, STRING);
		
		System.out.println(result);
	}
	
	/**
	 * Concatenates String with sum of an int and a double
	 * 
	 * @param a <code>int</code> integer number
	 * @param b <code>double</code> double number
	 * @param text <code>String</code> text
	 * @return concatenation of text and sum of numbers
	 * @author Oleg
	 */
	private static String concatenate(int a, double b, String text) {
		double sum = a + b;
		String result = text + sum;
		
		return result;
	}
}