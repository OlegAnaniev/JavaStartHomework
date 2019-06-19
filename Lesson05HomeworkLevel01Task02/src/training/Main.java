package training;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final String HEADER_MESSAGE = "Array";
		final String INPUT_LENGTH_MESSAGE = 
				"Enter array length (positive int): ";
		final String INPUT_ITEMS_MESSAGE = "Fill array: ";
		final String RESULT_MESSAGE = "Result: ";
		Scanner scanner = new Scanner(System.in);
		int[] array;
		int arrayLength;

		System.out.println(HEADER_MESSAGE);
		do {
			System.out.print(INPUT_LENGTH_MESSAGE);
			arrayLength = scanner.nextInt();
		} while (arrayLength <= 0);
		
		array = new int[arrayLength];
		
		System.out.println(INPUT_ITEMS_MESSAGE);
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + ": ");
			array[i] = scanner.nextInt();
		}
		
		System.out.println(RESULT_MESSAGE + Arrays.toString(array));
	}
}