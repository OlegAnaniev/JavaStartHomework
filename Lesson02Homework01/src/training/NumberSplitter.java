package training;

public class NumberSplitter {
	
	private NumberGenerator numberGenerator;
	private int intialNumber;
	private int number;
	private int numberLength = 0;
	private int divisor = 1;
	private int[] digits;

	public NumberSplitter(NumberGenerator numberGenerator) {
		this.numberGenerator = numberGenerator;
	}
	
	public int getNumber() {
		return intialNumber;
	}

	public int[] run() {
		intialNumber = numberGenerator.getNumber();
		number = Math.abs(intialNumber);
		getNumberLength(number);
		split();
		return digits;
	}

	private void getNumberLength(int number) {
		do {			
			number /= 10;
			divisor *= 10;
			numberLength++;
		} while (number > 0);
	}

	private void split() {
		digits = new int[numberLength];

		for (int i = 0; i < digits.length; i++) {
			digits[i] = number % divisor / (divisor / 10);
			divisor /= 10;
		}
	}
}