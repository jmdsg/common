package com.fiberg.common.object;

/**
 * Interface that checks if an object is mutable or immutable.
 */
public interface MutableAware {

	/**
	 * Method that indicates if the object is mutable or not.
	 * Is the opposite to the method {@link #isImmutable()}.
	 *
	 * @return {@code true} if the object is mutable {@code false} otherwise
	 */
	boolean isMutable();

	/**
	 * Method that indicates if the object is immutable or not.
	 * Is the opposite to the method {@link #isMutable()}.
	 *
	 * @return {@code true} if the object is immutable {@code false} otherwise
	 */
	boolean isImmutable();

}
