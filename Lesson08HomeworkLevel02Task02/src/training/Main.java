package training;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		final String FILE_MESSAGE = "Letter usage statistics for file %s:";
		final String NATURAL_ORDER_MESSAGE = "Natural order:";
		final String ASC_ORDER_MESSAGE = "Ascending order:";
		final String DESC_ORDER_MESSAGE = "Descending order:";
		final String PATH = "Romeo_and_Juliet.txt";
		File file = new File(PATH);		
		LetterCounter counter = new LetterCounter(file);
		int[][] array;
		
		System.out.println(String.format(FILE_MESSAGE, PATH));
		
		array = counter.getResult();
		System.out.println(NATURAL_ORDER_MESSAGE);
		print(array);	
		
		array = counter.getResult(new LetterCounterComparatorAsc());
		System.out.println(ASC_ORDER_MESSAGE);
		print(array);
		
		array = counter.getResult(new LetterCounterComparatorDesc());
		System.out.println(DESC_ORDER_MESSAGE);
		print(array);
	}
	
	/**
	 * Correctly prints the result returned by LetterCounter
	 * 
	 * @param array <code>int[][]</code>
	 * @author Oleg
	 */
	private static void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println((char)array[i][0] + ": " + array[i][1]);
		}
	}
}