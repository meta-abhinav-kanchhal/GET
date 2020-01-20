package aSSIGNMENT5;

public class LcmHcf {
	
	/**
	 * find the hcf of a numbers
	 * @param a as a first number of int type
	 * @param b as a second number of int type
	 * @return hcf of a numbers
	 */
	public int hcf(int number1, int number2){
		if ( number2==0 )
			return number1;
		else
		return hcf(number2,number1% number2);
	}
	
	/**
	 * find the lcm of a numbers
	 * @param number1 as a first number of int type
	 * @param number2 as a second number of int type
	 * @return lcm of a numbers
	 */
	public int lcm(int number1, int number2){
		return ((number1*number2)/hcf(number1, number2));
	}
}

