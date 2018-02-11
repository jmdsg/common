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
	default boolean isMutable() {
		return false;
	}

	/**
	 * Method that indicates that this object is immutable.
	 *
	 * @return {@code true} because this is an immutable object
	 * @see MutableAware#isImmutable()
	 */
	default boolean isImmutable() {
		return true;
	}

}
