package training;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {

	@Override
	public int getNumber() {
		Random random = new Random();
		
		if	(random.nextBoolean()) {
			number = random.nextInt(MAX_POSITIVE_VALUE - MIN_POSITIVE_VALUE)
					+ MIN_POSITIVE_VALUE;
		} else {
			number = random.nextInt(MAX_NEGATIVE_VALUE - MIN_NEGATIVE_VALUE)
					+ MIN_NEGATIVE_VALUE;			
		}
		
		return number;
	}
}