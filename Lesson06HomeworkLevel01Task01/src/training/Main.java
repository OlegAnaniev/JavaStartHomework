package training;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		final String ARRAY_MESSAGE = "Array:";
		final String MAX_MESSAGE = "Max value: ";
		final int ARRAY_LENGTH = 10;
		int[] array = createRandomArray(ARRAY_LENGTH);
		int max = findMax(array);
		
		System.out.println(ARRAY_MESSAGE);
		System.out.println(Arrays.toString(array));
		
		System.out.print(MAX_MESSAGE);
		System.out.println(max);
	}
	
	/**
	 * Creates int array of given length and fill it with random values in 
	 * range from -50 to 50
	 * 
	 * @param length <code>int</code> array length
	 * @return array
	 * @author Oleg
	 */	
	private static int[] createRandomArray(int length) {		
		final int MIN = -50;
		final int MAX = 50;
		int[] array = new int[length];
		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(MAX - MIN) + MIN;
		}
		
		return array;
	}
	
	/**
	 * Find max value in a 1d array of int
	 * 
	 * @param array <code>int[]</code> array
	 * @return max value
	 * @author Oleg
	 */
	private static int findMax(int[] array) {
		int max = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
	}
}