package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoFramework {
	
	@Test
	public void test1(){
		System.out.println("Test1 Result");
	}
	
	@Test
	public void test2(){
		Assert.assertTrue(false);
		System.out.println("Test2 Result");
	}
}
