package training;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		final String ARRAY_MESSAGE = "Array:";
		final String SEARCH_VALUE_MESSAGE = "Value to find: ";
		final String SEARCH_RESULT_MESSAGE = "Position: ";
		final int SEARCH_VALUE = -11;
		int[] array = new int[] { 1, 5, -11, 45, 3, 0 };
		int position = findValue(array, SEARCH_VALUE);
		
		System.out.println(ARRAY_MESSAGE);
		System.out.println(Arrays.toString(array));
		System.out.println(SEARCH_VALUE_MESSAGE + SEARCH_VALUE);
		System.out.println(SEARCH_RESULT_MESSAGE + position);

	}

	/**
	 * Finds position of the first occurrence of a value in a 1d array
	 * 
	 * @param haystack <code>int[]</code> array
	 * @param needle <code>int</code> value to search
	 * @return value position or -1 if value not found
	 * @author Oleg
	 */
	private static int findValue(int[] haystack, int needle) {
		for (int i = 0; i < haystack.length; i++) {
			if (haystack[i] == needle) {
				return i;
			}
		}

		return -1;
	}
}