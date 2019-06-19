package training;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		final String FIRST_ARRAY_MESSAGE = "Initial array: ";
		final String SECOND_ARRAY_MESSAGE = "Modified array: ";
		final int FIRST_ARRAY_LENGTH = 15;
		Random random = new Random();
		int[] firstArray = new int[FIRST_ARRAY_LENGTH];
		int[] secondArray;
		
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = random.nextInt(100) - 50;
		}

		secondArray = Arrays.copyOf(firstArray, FIRST_ARRAY_LENGTH * 2);
		
		for (int i = 0; i < FIRST_ARRAY_LENGTH; i++) {
			secondArray[FIRST_ARRAY_LENGTH + i] = secondArray[i] * 2;
		}
		
		System.out.println(FIRST_ARRAY_MESSAGE + Arrays.toString(firstArray));
		System.out.println(SECOND_ARRAY_MESSAGE 
				+ Arrays.toString(secondArray));
	}
}