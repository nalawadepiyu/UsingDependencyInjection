package com.apex.server;

public class BasicCalc implements Calc {
	
	/* (non-Javadoc)
	 * @see com.apex.server.Calc#add(int, int)
	 */
	public int add(int i, int j){
		return i + j;
	}
	
	/* (non-Javadoc)
	 * @see com.apex.server.Calc#sub(int, int)
	 */
	public int sub(int i, int j){
		return i - j;
	}
	
	/* (non-Javadoc)
	 * @see com.apex.server.Calc#mult(int, int)
	 */
	public int mult(int i, int j){
		return i * j;
	}
	
	/* (non-Javadoc)
	 * @see com.apex.server.Calc#div(int, int)
	 */
	public int div(int i, int j){
		return i / j;
	}

}
