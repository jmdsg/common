package com.fiberg.common.tuple;

/**
 * Tuple of 2 elements.
 */
public abstract class RawTuple2<T1, T2> implements RawTuple {

	/**
	 * Value of the first element.
	 */
	protected T1 t1;

	/**
	 * Value of the second element.
	 */
	protected T2 t2;

	/**
	 * Constructor of the tuple.
	 *
	 * @param t1 value of the first element
	 * @param t2 value of the second element
	 */
	public RawTuple2(final T1 t1,
	                 final T2 t2) {
		this.t1 = t1;
		this.t2 = t2;
	}

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
