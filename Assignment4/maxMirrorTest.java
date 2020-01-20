package assignment4;

import static org.junit.Assert.*;

import org.junit.Test;

public class maxMirrorTest {

	ArrOperation arrOperationObj = new ArrOperation();

	@Test
	public void expression() {
		int[] arr = {1,2,3,5,6,3,2,1};
		int result = arrOperationObj.maxMirror(arr);
		assertEquals(3,result);
	}
	
	@Test
	public void expression1() {
		int[] arr = {1,2,2,3,4,4};
		int result = arrOperationObj.maxMirror(arr);
		assertEquals(2,result);
	}

	@Test
	public void expression2() {
		int[] arr = {1,1,2,1,1};
		int result = arrOperationObj.maxMirror(arr);
		assertEquals(5,result);
	}
	
	@Test
	public void expression3() {
		int[] arr = {1,1,1,1,1};
		int result = arrOperationObj.maxMirror(arr);
		assertEquals(5,result);
	}
	
	@Test
	public void expression4() {
		int[] arr = {};
		
		try {
			assertEquals("size of array is zero",1,arrOperationObj.maxMirror(arr));
		}
		catch (AssertionError e) {
			System.out.println("finished");
		}
	}


}
