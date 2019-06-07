package training;

public abstract class NumberGenerator {
	
	protected final int MIN_POSITIVE_VALUE = 10000;
	protected final int MAX_POSITIVE_VALUE = 99999;
	protected final int MIN_NEGATIVE_VALUE = -99999;
	protected final int MAX_NEGATIVE_VALUE = -10000;
	protected int number;
	
	public abstract int getNumber();
}