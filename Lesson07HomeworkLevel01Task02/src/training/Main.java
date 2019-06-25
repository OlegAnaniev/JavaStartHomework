package training;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] array = new int[] { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 };
		
		System.out.println(Arrays.toString(array));
		System.out.println(arrayToString(array));
	}
	
	/**
	 * Converts a 1d array of int into String
	 * 
	 * @param <code>int[]</code> array
	 * @return <code>String</code>
	 * @author Oleg
	 */
	private static String arrayToString(int[] array) {
		
		final String OPENING_BRACKETS = "[";
		final String SEPARATOR = ", ";
		final String CLOSING_BRACKETS = "]";
		StringBuilder text = new StringBuilder(OPENING_BRACKETS);
		
		for (int i = 0; i < array.length - 1; i++) {
			text.append(array[i] + SEPARATOR);
		}
		
		text.append(array[array.length - 1] + CLOSING_BRACKETS);
		
		return text.toString();
	}
}