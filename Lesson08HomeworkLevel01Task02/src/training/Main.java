package training;

import java.io.PrintWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[][] array = new int[][] { 
			new int[] { 1, 2, 3 }, 
			new int[] { 1, 2, 3, 4 }, 
			new int[] { 1, 2, 3, 4, 5 } };

		twoDimIntArrayToFile(array, "array.txt");
	}

	/**
	 * Saves 2d array of int to file
	 * 
	 * @param array <code>int[][]</code>
	 * @param path <code>String</code>
	 * @author Oleg
	 */
	private static void twoDimIntArrayToFile(int[][] array, String path) {
		
		final String DONE_MESSAGE = "Array successfully saved to file %s";

		try (PrintWriter printwriter = new PrintWriter(path)) {

//			Easiest universal solution
//			printwriter.println(Arrays.deepToString(array));
			
//			More readable solution
//			for (int i = 0; i < array.length; i++) {
//				printwriter.println(Arrays.toString(array[i]));
//			}
			
//			Import friendly solution
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length - 1; j++) {
					printwriter.print(array[i][j] + ",");
				}
				
				printwriter.print(array[i][array[i].length - 1] + "\n");				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(String.format(DONE_MESSAGE, path));
	}
}