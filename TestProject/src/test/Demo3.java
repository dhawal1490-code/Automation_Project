package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo3 {

	@Test
	public void test5(){
		System.out.println("Test5 Result");
	}
	
	@BeforeTest
	public void test6(){
		System.out.println("Test6 Result");
	}
}
