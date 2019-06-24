package training;

public abstract class Progression {

	protected int[] progression;
	protected boolean isValid;
	protected int step;
	
	/**
	 * Constructs a new progression analyzer
	 * 
	 * @param progression <code>int[]</code>
	 * @author Oleg
	 */
	public Progression(int[] progression) {
		this.progression = progression;
	}
	
	/**
	 * Returns true if progression is valid and false otherwise
	 * 
	 * @return <code>boolean</code>
	 * @author Oleg
	 */
	public boolean isValid() {
		return isValid;
	}	
	
	/**
	 * Validates progression and sets isValid value
	 * 
	 * @author Oleg
	 */
	protected abstract void validate();
	
	/**
	 * Calculates the next member of progression
	 * 
	 * @return <code>int</code> next progression member
	 * @author Oleg
	 */
	public abstract int getNextMember();
}
