package training;

public class Main {

	public static void main(String[] args) {
		
		final String SEQUENCE_MESSAGE = "Sequence: ";
		final String ELEMENT_MESSAGE = "Element: ";
		String[] rows = new String[] 
				{ "11111111", "12121212", "121121121", "1234", "1234123" };

		for (int i = 0; i < rows.length; i++) {
			System.out.println(SEQUENCE_MESSAGE + rows[i]);
			System.out.println(ELEMENT_MESSAGE + getRowMinElement(rows[i]));
		}
	}

	/**
	 * Identifies an element of a repeated sequence
	 * 
	 * @param row <code>String</code>
	 * @return sequence <code>String</code>
	 * @author Oleg
	 */
	private static String getRowMinElement(String row) {

		StringBuilder element = new StringBuilder();
		boolean sequenceFound;

		for (int i = 0; i < row.length(); i++) {
			element.append(row.charAt(i));
			sequenceFound = true;

			int j = 0;
			int from = j * element.length();
			int to = from + element.length();
			while (to <= row.length()) {
				if (!element.toString().equals(row.substring(from, to))) {
					sequenceFound = false;
					break;
				}

				j++;
				from = j * element.length();
				to = from + element.length();
			}

			if (from == row.length() && sequenceFound) {
				break;
			}
		}

		return element.toString();
	}
}