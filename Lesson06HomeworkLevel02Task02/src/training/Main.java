package training;

public class Main {

	public static void main(String[] args) {
		final String OUTPUT_MESSAGE = "Max palindrome: ";
		final int DIGIT_COUNT = 3;
		
		System.out.println(OUTPUT_MESSAGE + findMaxPalindrome(DIGIT_COUNT));

	}

	/**
	 * Calculates max palindrome received as a product of two numbers of
	 * given length
	 * 
	 * @param digitCount <code>int</code> length of numbers
	 * @return max palindrome
	 * @author Oleg
	 */
	private static int findMaxPalindrome(int digitCount) {
		int maxPalindrome = 0;
		int minFactor = (int) Math.pow(10, digitCount - 1);
		int maxFactor = (int) Math.pow(10, digitCount);
		int product;

		for (int i = minFactor; i < maxFactor; i++) {
			for (int j = minFactor; j < maxFactor; j++) {
				product = i * j;

				if (isPalindrome(product) && product > maxPalindrome) {
					maxPalindrome = product;
				}
			}
		}

		return maxPalindrome;
	}

	/**
	 * Validates if the given number is a palindrome
	 * 
	 * @param number <code>int</code>
	 * @return <code>true</code> if the number is a palindrome and 
	 * <code>false</code> otherwise
	 */
	private static boolean isPalindrome(int number) {
		char[] digits = Integer.toString(number).toCharArray();

		for (int i = 0; i < digits.length / 2; i++) {
			if (digits[i] != digits[digits.length - i - 1]) {
				return false;
			}
		}
		
		return true;
	}
}