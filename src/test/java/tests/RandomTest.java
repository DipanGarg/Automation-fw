package tests;

import org.cts.utils.AssertionLibrary;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RandomTest {
	
   @Test
   public void invalidLoginTest_InvalidUserNameInvalidPassword () throws InterruptedException {
       //ExtentReports Description
	   AssertionLibrary.assertEquals("ABC","ABC","String Matches PASS");
	   AssertionLibrary.assertEquals("ABC","ABC1","String Matches");   
   }
  
   @AfterMethod
   public void handleException(){
   	System.out.println(" i am in after method ");
 
   }
	
}
