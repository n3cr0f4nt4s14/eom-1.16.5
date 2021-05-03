package de.eom.util;

/**
 * The purity interface enables objects to have a purity.<br>
 * <br>
 * The purity may either be a static (constant) or variable (calculated) value.<br>
 * The following criteria apply:
 * <ul>
 * 		<li>must be >= {@link #getMinPurity()}</li>
 * 		<li>must be <= {@link #getMaxPurity()}</li>
 * 		<li>the minimum purity value is {@value #MIN_VALUE}<br>
 * 			A value of 0% doesn't make any sense.</li>
 * 		<li>the maximum purity value is {@value #MAX_VALUE}</li>
 * 		<li>The values are given in percent:<br>
 * 			<tt>0.0001f = 0.01%</tt> and <tt>1.00f = 100%</tt></li>
 * </ul>
 * The interval may also be smaller, but it must be within the given bounds.
 * 
 * @since 2021-05-03
 * @version 1.00
 * @author Necrofantasia
 *
 */
public interface IPurity {
	/** The minimum purity value (0.01%). A value of 0% doesn't make any sense. */
	public static final float MIN_VALUE = 0.0001f;
	/** The maximum purity value (100%). */
	public static final float MAX_VALUE = 1.00f;
	
	/**
	 * Returns the minimum purity.
	 * @return the minimum purity
	 * @see IPurity
	 */
	public float getMinPurity();
	
	/**
	 * Returns the maximum purity.
	 * @return the maximum purity
	 * @see IPurity
	 */
	public float getMaxPurity();
	
	/**
	 * Returns the current purity.<br>
	 * May return a static (constant) or variable (calculated) value.<br>
	 * The following criteria apply:
	 * <ul>
	 * 		<li>must be >= {@link #getMinPurity()}</li>
	 * 		<li>must be <= {@link #getMaxPurity()}</li>
	 * </ul>
	 * @return the current purity
	 * @see IPurity
	 */
	public float getPurity();
	
	/**
	 * Returns whether or not the specified purity value is valid.
	 * @param purity the value to validate
	 * @return true if it is valid
	 * @see IPurity
	 */
	public static boolean isValid(float purity) {
		return purity >= MIN_VALUE && purity <= MAX_VALUE;
	}
}
