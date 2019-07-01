package training;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LetterCounter {

	private int[][] result;
	private File file;

	/**
	 * Creates and initializes LetterCounter, calculates letter usage in a
	 * given file
	 * 
	 * @param file <code>File</code>
	 * @author Oleg
	 */
	public LetterCounter(File file) {
		result = new int['z' - 'a' + 1][];

		for (int i = 0; i < result.length; i++) {
			result[i] = new int[] { 'a' + i, 0 };

		}
		
		this.file = file;
		
		count();
	}
	
	/**
	 * Returns letter usage statistics
	 * 
	 * @return <code>int[][]</code>
	 */
	public int[][] getResult() {
		return result;
	}
	
	/**
	 * Returns sorted letter usage statistics
	 * 
	 * @param comparator <code>Comparator<int[]></code>
	 * @return int[][]
	 * @author Oleg
	 */
	public int[][] getResult(Comparator<int[]> comparator) {
		Arrays.sort(result, comparator);
		return result;
	}
	
	/**
	 * Iterates through file lines
	 * 
	 * @author Oleg
	 */
	private void count() {		
		StringBuilder text = new StringBuilder();
		
		try (Scanner scanner = new Scanner(file)) {
			while (scanner.hasNextLine()) {
				text.append(scanner.nextLine());
				countLine(text);
				text.delete(0, text.length());
			}		
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	/**
	 * Calculates letter usage in a line
	 * 
	 * @param text <code>StringBuilder</code>
	 * @author Oleg
	 */
	private void countLine(StringBuilder text) {
		int length = text.length();
		
		for (int i = 0; i < length; i++) {
			if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
				result[text.charAt(i) - 'a'][1]++;
			}
			
			if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
				result[text.charAt(i) - 'A'][1]++;
			}
		}
	}
}