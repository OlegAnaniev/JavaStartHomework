package training;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		File file = new File("array.txt");
		int[][] array = read2dArrayFromFile(file);
		
		System.out.println(Arrays.deepToString(array));
		
		array = read2dArrayFromFileAlternative(file);
		System.out.println(Arrays.deepToString(array));
	}
	
	/**
	 * Reads a 2d array of int from the file specified
	 * 
	 * @param path <code>File</code>
	 * @return <code>int[][]</code>
	 */
	private static int[][] read2dArrayFromFile(File path) {
		
		StringBuilder text = new StringBuilder();
		String[] rows;
		String[] items;
		int[][] array = null;
		
		try (Scanner scanner = new Scanner(path)) {
			while (scanner.hasNextLine()) {
				text.append(scanner.nextLine() + "\n");
			}
			
			rows = text.toString().split("[\n]");			
			array = new int[rows.length][];						
			
			for (int i = 0; i < rows.length; i++) {
				items = rows[i].split("[,]");
				array[i] = new int[items.length];
				
				for (int j = 0; j < items.length; j++) {
					array[i][j] = Integer.parseInt(items[j]);
				}
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}			
		
		return array;		
	}
	
	/**
	 * Reads a 2d array of int from the file specified
	 * in a more complicated but memory friendly way
	 * 
	 * @param path <code>File</code>
	 * @return <code>int[][]</code>
	 */
	private static int[][] read2dArrayFromFileAlternative(File path) {
		
		StringBuilder text = new StringBuilder();
		int[][] array = null;
		int counter = 0;
		int lineStart = 0;
		int lineEnd;
		int itemStart;
		
		try (Scanner scanner = new Scanner(path)) {
			while (scanner.hasNextLine()) {
				text.append(scanner.nextLine() + "\n");
				counter++;
			}			
				
			array = new int[counter][];
			
			for (int i = 0; i < array.length; i++) {
				
				lineEnd = text.indexOf("\n", lineStart);
				
				counter = 0;
				for (int j = lineStart; j <= lineEnd; j++) {
					if (text.charAt(j) == ',') {
						counter++;
					}
				}
				
				array[i] = new int[counter + 1];
				
				counter = 0;				
				itemStart = lineStart;
				for (int j = lineStart; j <= lineEnd; j++) {
					if (text.charAt(j) == ',' || text.charAt(j) == '\n') {
						array[i][counter++] = 
								Integer.parseInt(text.substring(itemStart, j));						
						itemStart = j + 1;
					}
				}
				
				lineStart = lineEnd + 1;
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		return array;
	}
}