package training;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {

		System.out.println(getMonthMillis());
	}
	
	/**
	 * Calculates time form the beginning of the day a month ago till now 
	 * 
	 * @return milliseconds
	 * @author Oleg
	 */
	private static long getMonthMillis() {
		
		Calendar today = Calendar.getInstance();
		Calendar monthAgo = Calendar.getInstance();
		
		monthAgo.set(Calendar.MONTH, today.get(Calendar.MONTH) - 1);
		monthAgo.set(Calendar.HOUR, 0);
		monthAgo.set(Calendar.MINUTE, 0);
		monthAgo.set(Calendar.SECOND, 0);
						
		return today.getTimeInMillis() - monthAgo.getTimeInMillis();
	}
}