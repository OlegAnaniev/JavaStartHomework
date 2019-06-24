package training;

public class PowerSeries extends Progression {

	private final int MAX_POWER = 5;
	private double rootLastMember;
	
	/**
	 * Constructs a new power series analyzer
	 * 
	 * @param progression <code>int[]</code>
	 * @author Oleg
	 */
	public PowerSeries(int[] progression) {
		super(progression);
		validate();
	}

	@Override
	protected void validate() {		
		boolean isPowerSeries;
		double rootPreLastMember;

		for (int i = 2; i < MAX_POWER; i++) {
			isPowerSeries = true;			

			for (int j = 1; j < progression.length; j++) {
				rootPreLastMember = Math.pow(progression[j - 1], 1.0 / i);
				rootLastMember = Math.pow(progression[j], 1.0 / i);
				
				if (Math.abs(rootLastMember - rootPreLastMember - 1) > 0.01) {						
					isPowerSeries = false;
					break;
				}
			}

			if (isPowerSeries) {
				isValid = true;
				step = i;
				return;
			}
		}

		isValid = false;
	}

	@Override
	public int getNextMember() {
		return (int)Math.round(Math.pow(rootLastMember + 1, step));
	}
}