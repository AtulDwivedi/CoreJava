package corejava.jUnit;

import junit.framework.Assert;

import org.junit.Test;

public class JUnitTestsForMyClass {
	@Test
	public void multOfTwoNumOneOfThemIsZero(){
		int result = MyClass.mult(0,3);
		Assert.assertEquals("Both are positive.", 0, result);
	}
	
	@Test
	public void multOfTwoNumOneOfThemIsNegative(){
		int result = MyClass.mult(2,-3);
		Assert.assertEquals("Both are positive.", -1, result);
	}
	
	@Test
	public void multOfTwoNumBothArePositive(){
		int result = MyClass.mult(2,3);
		Assert.assertEquals("Both are positive.", 6, result);
	}
}
