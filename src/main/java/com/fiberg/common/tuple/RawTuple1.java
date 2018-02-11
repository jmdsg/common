package com.fiberg.common.tuple;

/**
 * Tuple of 1 element.
 */
public abstract class RawTuple1<T1> implements RawTuple {

	/**
	 * Method that returns the cardinality of the tuple 1.
	 *
	 * @return the cardinality of 1
	 * @see RawTuple#cardinality()
	 */
	@Override
	public int cardinality() {
		return 1;
	}

	/**
	 * Method that returns the value of the first element.
	 *
	 * @return the value of the first element
	 */
	public abstract T1 $1();

}
