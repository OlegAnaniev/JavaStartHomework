package training;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		final String INITIAL_ARRAY_MESSAGE = "Initial array:";
		final String REVERSED_ARRAY_MESSAGE = "Reversed array:";
		Random random = new Random();
		int[] array;
		int tempValue;
		
		array = new int[random.nextInt(9) + 1];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100) - 50;
		}
		
		System.out.println(INITIAL_ARRAY_MESSAGE);
		System.out.println(Arrays.toString(array));
		
		for (int i = 0; i < array.length / 2; i++) {
			tempValue = array[i]; 
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = tempValue;
		}
		
		System.out.println(REVERSED_ARRAY_MESSAGE);
		System.out.println(Arrays.toString(array));
	}
}