package training;

public class GeometricProgression extends Progression {

	/**
	 * Constructs a new geometric progression analyzer
	 * 
	 * @param progression <code>int[]</code>
	 * @author Oleg
	 */
	public GeometricProgression(int[] progression) {
		super(progression);
		setStep();
		validate();
	}

	/**
	 * Calculates and sets step of the progression
	 * 
	 * @author Oleg
	 */
	protected void setStep() {
		if (progression[0] == 0 || progression[1] % progression[0] != 0) {
			step = 0;
			return;
		}
		
		step = progression[1] / progression[0];
	}

	@Override
	protected void validate() {
		if (step == 0) {
			isValid = false;
			return;
		}
		
		for (int i = 2; i < progression.length; i++) {
			if (progression[i] / progression[i - 1] != step
					|| progression[i] % progression[i - 1] != 0) {
				isValid = false;
				return;
			}
		}

		isValid = true;
	}

	@Override
	public int getNextMember() {
		return progression[progression.length - 1] * step;
	}
}