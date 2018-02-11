package com.fiberg.common.tuple;

/**
 * Tuple of 2 elements.
 */
public abstract class RawTuple2<T1, T2> implements RawTuple {

	/**
	 * Method that returns the cardinality of the tuple 2.
	 *
	 * @return the cardinality of 2
	 * @see RawTuple#cardinality()
	 */
	@Override
	public int cardinality() {
		return 2;
	}

	/**
	 * Method that returns the value of the first element.
	 *
	 * @return the value of the first element
	 */
	public abstract T1 $1();

	/**
	 * Method that returns the value of the second element.
	 *
	 * @return the value of the second element
	 */
	public abstract T2 $2();

}
