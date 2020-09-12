package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo2 {

	@Parameters({"url"})
	@BeforeSuite
	public void test3(String url){
		System.out.print(url);
		System.out.println("Test3 Result");
	}
	
	@AfterTest
	public void test4(){
		System.out.println("Test4 Result");
	}
	
	@Test(dataProvider ="getData")
	public void dataprovidertest(String username, String password){
		System.out.println(username);
		System.out.println(password);
		System.out.println("dataprovidertest Result");
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data= new Object[3][2];
		
		data[0][0]="US1";
		data[0][1]="PS1";
		
		data[1][0]="US2";
		data[1][1]="PS2";
		
		data[2][0]="US3";
		data[2][1]="PS3";
	
		return data;
	}
}
