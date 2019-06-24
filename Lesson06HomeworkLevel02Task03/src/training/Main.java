package training;

import java.util.Arrays;

public class Main {
	
	private static int counter = 1;

	public static void main(String[] args) {
		final int LENGTH = 5;		
		final int START_POSITION = 0;
		int[] array = new int[LENGTH];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		
		displaySequence(array, START_POSITION);

	}
	
	/**
	 * Recursively builds sequence of element swaps
	 * Displays new swap when is built
	 * 
	 * @param array <code>int[]</code> initial set
	 * @param startPos <code>int</code> position starting form which elements 
	 * are swapped
	 * @author Oleg
	 */
	private static void displaySequence(int[] array, int startPos) {

		if (startPos == array.length) {
			System.out.println(counter + ": " + Arrays.toString(array));
			counter++;
		} else {
			for (int i = startPos; i < array.length; i++) {
				swapElements(array, startPos, i);
				displaySequence(array, startPos + 1);
				swapElements(array, startPos, i);
			}
		}
	}

	/**
	 * Swaps two elements and sorts the tail in lexicographical order
	 * 
	 * @param array <code>int[]</code> current set
	 * @param posOne <code>int</code> first position to swap
	 * @param posTwo <code>int</code> second position to swap
	 * @author Oleg
	 */
	private static void swapElements(int[] array, int posOne, int posTwo) {
		int temp = array[posOne];
		array[posOne] = array[posTwo];
		array[posTwo] = temp;
		
		Arrays.sort(array, posOne + 1, array.length);
	}	
}