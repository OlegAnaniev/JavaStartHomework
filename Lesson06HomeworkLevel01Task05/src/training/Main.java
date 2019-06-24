package training;

public class Main {

	public static void main(String[] args) {
		final String TEXT_MESSAGE = "Text:";
		final String WORDS_MESSAGE = "Words: ";
		final String TEXT = "qwe asd, zxc.rty!!!fgh? ";
		int words = countWords(TEXT);
		
		System.out.println(TEXT_MESSAGE);
		System.out.println(TEXT);
		System.out.println(WORDS_MESSAGE + words);
	}
	
	/**
	 * Counts the amount of words in a text
	 * 
	 * @param text <code>String</code>
	 * @return amount of words
	 * @author Oleg
	 */
	private static int countWords(String text) {
		String[] array = text.split("[ |,|.|!|?]");
		int counter = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() > 0) {
				counter++;
			}
		}
		
		return counter;
	}
}