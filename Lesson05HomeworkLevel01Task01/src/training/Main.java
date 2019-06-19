package training;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		final String ARRAY_MESSAGE = "Array: ";
		final String ODD_COUNT_MESSAGE = "Odd numbers: ";
		int[] array = { 0, 5, 2, 4, 7, 1, 3, 19 };
		int oddCount = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				oddCount++;
			}
		}
		
		System.out.println(ARRAY_MESSAGE);
		System.out.println(Arrays.toString(array));
		System.out.println(ODD_COUNT_MESSAGE + oddCount);
	}
}