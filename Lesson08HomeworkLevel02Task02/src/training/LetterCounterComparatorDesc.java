package training;

import java.util.Comparator;

public class LetterCounterComparatorDesc implements Comparator<int[]>{

	/**
	 * Provides Comparator for LetterCounter result is descending order
	 * 
	 * @author Oleg
	 */
	@Override
	public int compare(int[] o1, int[] o2) {
		if (o1[1] == o2[1]) {
			return 0;
		} else if (o1[1] < o2[1]) {
			return 1;
		} else {
			return -1;
		}		
	}

}