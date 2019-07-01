package training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		final String PATH = "pattern.txt";
		final String OUTPUT_MESSAGE = "Pattern saved to file %s";		
		
		savePattern(PATH);
		System.out.println(String.format(OUTPUT_MESSAGE, PATH));
	}
	
	/**
	 * Saves a pattern with randomly generated offset to file
	 * 	
	 * @param path <code>String</code>
	 * @author Oleg
	 */
	private static void savePattern(String path) {
		final char START_SYMBOL = '!';
		final char END_SYMBOL = '/';		
		final int HEIGHT = 40;
		final int WIDTH = 40;	
		Random random = new Random();
		int offset = random.nextInt(END_SYMBOL - START_SYMBOL);		
		
		try (PrintWriter pw = new PrintWriter(path)) {
			for (int i = 0; i < HEIGHT; i++) {
				for (int j = 0; j < WIDTH; j++) {
					pw.print((char)(START_SYMBOL + 
							(i + j + offset) % (END_SYMBOL - START_SYMBOL + 1)));
				}
				pw.println();
			}
		} catch (IOException e) {
			e.printStackTrace();	
		}		
	}
}