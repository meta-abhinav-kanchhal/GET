package assignment4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class splitArrayTest {
	ArrOperation arrOperationObj = new ArrOperation();
	
	@Test
	public void expression() {
		int[] arr = {1,1,1,2,1};
		int result = arrOperationObj.splitString(arr);
		assertEquals(3,result);
	}

	@Test
	public void expression1() {
		int[] arr = {2,1,1,2,1};
		int result = arrOperationObj.splitString(arr);
		assertEquals(-1,result);
	}
	
	@Test
	public void expression2() {
		int[] arr = {1,2,1,4};
		int result = arrOperationObj.splitString(arr);
		assertEquals(3,result);
	}
	
	@Test
	public void expression3() {
		int[] arr = {};
		try {
			assertEquals("size of array is zero",1,arrOperationObj.splitString(arr));
		}
		catch (AssertionError e) {
			System.out.println("finished");
		}
	}
}
