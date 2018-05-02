package tests;

import org.cts.utils.AssertionLibrary;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RandomTest {
	
	
	@DataProvider(name = "browser-provider")
	  public Object[][] provide() throws Exception {
	      return new Object[][] {
	          {"TABLETS"},
	          {"MICE"},
	         };
	  }
   @Test (dataProvider = "browser-provider")
   public void invalidLoginTest_InvalidUserNameInvalidPassword (String broswer) throws InterruptedException {
       //ExtentReports Description
	   AssertionLibrary.assertEquals("ABC","ABC","String Matches PASS: RANDOM TEST"+broswer);
	   AssertionLibrary.assertEquals("ABC","ABC1","String Matches RANDOM TEST");   
   }
  
   @AfterMethod
   public void handleException(){
   	System.out.println(" i am in after method of random test ");
 
   }
	
}
