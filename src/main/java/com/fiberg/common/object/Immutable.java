package com.fiberg.common.object;

/**
 * Immutable interface.
 */
public interface Immutable extends MutableAware {

	/**
	 * Method that indicates that this object is not mutable.
	 *
	 * @return {@code false} because this is not a mutable object
	 * @see MutableAware#isMutable()
	 */
	boolean isMutable();

	/**
	 * Method that indicates that this object is immutable.
	 *
	 * @return {@code true} because this is an immutable object
	 * @see MutableAware#isImmutable()
	 */
	boolean isImmutable();

}
