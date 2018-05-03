package tests;

import org.cts.utils.AssertionLibrary;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.cts.configHandling.ConfigProvider;

public class RandomTest {
	
	
	
	@BeforeMethod
	public void setup() {
	
	}
	
   @Test 
   public void invalidLoginTest_InvalidUserNameInvalidPassword () throws InterruptedException {
       //ExtentReports Description
	   AssertionLibrary.assertEquals("ABC","ABC","String Matches PASS: RANDOM TEST");
	   AssertionLibrary.assertEquals("ABC","ABC","String Matches RANDOM TEST");
	   String hello = ConfigProvider.getInstance().getProperty("database.host");
		System.out.println("reading from configprovider"+ hello);
   }
  
   @AfterMethod
   public void handleException(){
   	System.out.println(" i am in after method of random test ");
 
   }
	
}
