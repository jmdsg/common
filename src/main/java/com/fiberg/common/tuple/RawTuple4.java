package com.fiberg.common.tuple;

/**
 * Tuple of 4 elements.
 */
public abstract class RawTuple4<T1, T2, T3, T4> implements RawTuple {

	/**
	 * Method that returns the cardinality of the tuple 4.
	 *
	 * @return the cardinality of 4
	 * @see RawTuple#cardinality()
	 */
	@Override
	public int cardinality() {
		return 4;
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

	/**
	 * Method that returns the value of the third element.
	 *
	 * @return the value of the third element
	 */
	public abstract T3 $3();

	/**
	 * Method that returns the value of the fourth element.
	 *
	 * @return the value of the fourth element
	 */
	public abstract T4 $4();

}
