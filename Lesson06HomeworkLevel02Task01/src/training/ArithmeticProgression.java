package training;

public class ArithmeticProgression extends Progression {

	/**
	 * Constructs a new arithmetic progression analyzer
	 * 
	 * @param progression <code>int[]</code>
	 * @author Oleg
	 */
	public ArithmeticProgression(int[] progression) {
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
		step = progression[1] - progression[0];		
	}
	
	@Override
	protected void validate() {
		for (int i = 2; i < progression.length; i++) {
			if (progression[i] - progression[i - 1] != step) {
				isValid = false;
				return;
			}
		}

		isValid = true;
	}

	@Override
	public int getNextMember() {
		return progression[progression.length - 1] + step;
	}
}