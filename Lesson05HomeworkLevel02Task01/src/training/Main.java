package training;

import java.util.Arrays;

public class Main {

	private static final int SIZE = 6;
	
	public static void main(String[] args) {

		final String INITIAL_ARRAY_MESSAGE = "Initial array:";
		final String ROTATED_ARRAY_MESSAGE = "Rotated by ";
		
		int[][] array = new int[SIZE][];
		int tempValue;

		for (int i = 0; i < SIZE; i++) {
			array[i] = new int[SIZE];

			for (int j = 0; j < SIZE; j++) {
				array[i][j] = j;
			}
		}

		printArray(array, INITIAL_ARRAY_MESSAGE);

		// Full circle by 90 degrees
		for (int i = 0; i < 4; i++) {
			rotate90(array);
			printArray(array, ROTATED_ARRAY_MESSAGE + 90);
		}
		
		// Full circle by 180 degrees
		for (int i = 0; i < 2; i++) {
			rotate180(array);
			printArray(array, ROTATED_ARRAY_MESSAGE + 180);
		}
		
		// Full circle by 270 degrees
		for (int i = 0; i < 4; i++) {
			rotate270(array);
			printArray(array, ROTATED_ARRAY_MESSAGE + 270);
		}
	}

	private static void printArray(int[][] array, String message) {
		
		System.out.println(message);
		for (int i = 0; i < SIZE; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}

	private static void rotate90(int[][] array) {
		
		int tempValue;

		for (int i = 0; i < SIZE / 2; i++) {
			for (int j = 0; j < SIZE / 2; j++) {
				tempValue = array[i][j];
				array[i][j] = array[SIZE - j - 1][i];
				array[SIZE - j - 1][i] = array[SIZE - i - 1][SIZE - j - 1];
				array[SIZE - i - 1][SIZE - j - 1] = array[j][SIZE - i - 1];
				array[j][SIZE - i - 1] = tempValue;
			}
		}
	}

	private static void rotate180(int[][] array) {
		
		int tempValue;

		for (int i = 0; i < SIZE / 2; i++) {
			for (int j = 0; j < SIZE; j++) {
				tempValue = array[i][j];
				array[i][j] = array[SIZE - i - 1][SIZE - j - 1];
				array[SIZE - i - 1][SIZE - j - 1] = tempValue;
			}
		}
	}

	private static void rotate270(int[][] array) {
		
		int tempValue;

		for (int i = 0; i < SIZE / 2; i++) {
			for (int j = 0; j < SIZE / 2; j++) {
				tempValue = array[i][j];
				array[i][j] = array[j][SIZE - i - 1];
				array[j][SIZE - i - 1] = array[SIZE - i - 1][SIZE - j - 1];
				array[SIZE - i - 1][SIZE - j - 1] = array[SIZE - j - 1][i];
				array[SIZE - j - 1][i] = tempValue;
			}
		}
	}
}