package com.fiberg.common.tuple;

/**
 * Tuple of 1 element.
 */
public abstract class RawTuple1<T1> implements RawTuple {

	/**
	 * Value of the first element.
	 */
	protected T1 t1;

	/**
	 * Constructor of the tuple.
	 *
	 * @param t1 value of the first element
	 */
	public RawTuple1(final T1 t1) {
		this.t1 = t1;
	}

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
	public T1 $1() {
		return t1;
	}

}
