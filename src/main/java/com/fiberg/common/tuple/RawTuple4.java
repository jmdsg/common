package com.fiberg.common.tuple;

/**
 * Tuple of 4 elements.
 */
public abstract class RawTuple4<T1, T2, T3, T4> implements RawTuple {

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
	 * Value of the fourth element.
	 */
	protected T4 t4;

	/**
	 * Constructor of the tuple.
	 *
	 * @param t1 value of the first element
	 * @param t2 value of the second element
	 * @param t3 value of the third element
	 * @param t3 value of the fourth element
	 */
	public RawTuple4(final T1 t1,
	                 final T2 t2,
	                 final T3 t3,
	                 final T4 t4) {
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
	}

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
	public T1 $1() {
		return t1;
	}

	/**
	 * Method that returns the value of the second element.
	 *
	 * @return the value of the second element
	 */
	public T2 $2() {
		return t2;
	}

	/**
	 * Method that returns the value of the third element.
	 *
	 * @return the value of the third element
	 */
	public T3 $3() {
		return t3;
	}

	/**
	 * Method that returns the value of the fourth element.
	 *
	 * @return the value of the fourth element
	 */
	public T4 $4() {
		return t4;
	}

}
