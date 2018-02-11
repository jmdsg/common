package com.fiberg.common.object;

/**
 * Mutable interface.
 */
public interface Mutable extends MutableAware {

	/**
	 * Method that indicates that this object is mutable.
	 *
	 * @return {@code true} because this is a mutable object
	 * @see MutableAware#isMutable()
	 */
	boolean isMutable();

	/**
	 * Method that indicates that this object is not immutable.
	 *
	 * @return {@code false} because this is not an immutable object
	 * @see MutableAware#isImmutable()
	 */
	boolean isImmutable();

}
