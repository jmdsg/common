package com.fiberg.common.tuple;

/**
 * Tuple of 3 elements.
 */
public abstract class RawTuple3<T1, T2, T3> implements RawTuple {

	/**
	 * Value of the first element.
	 */
	protected T1 t1;

	/**
	 * Value of the second element.
	 */
	protected T2 t2;

	/**
	 * Value of the third element.
	 */
	protected T3 t3;

	/**
	 * Constructor of the tuple.
	 *
	 * @param t1 value of the first element
	 * @param t2 value of the second element
	 * @param t3 value of the third element
	 */
	public RawTuple3(final T1 t1,
	                 final T2 t2,
	                 final T3 t3) {
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}

	/**
	 * Method that returns the cardinality of the tuple 3.
	 *
	 * @return the cardinality of 3
	 * @see RawTuple#cardinality()
	 */
	@Override
	public int cardinality() {
		return 3;
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

}
