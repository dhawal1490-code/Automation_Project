package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo4 {

	@AfterSuite
	public void test7(){
		System.out.println("Test7 Result");
	}
	
	@BeforeTest
	public void test8(){
		System.out.println("Test8 Result");
	}
}
