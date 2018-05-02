
package tests;

import org.cts.utils.AssertionLibrary;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTests  {

	@DataProvider(name = "browser-provider")
	  public Object[][] provide() throws Exception {
	      return new Object[][] {
	          {"TABLETS"},
	          {"MICE"},
	         };
	  }
	
	@BeforeTest
	 public void setUp() {
		 //al = new AssertionLibrary("Invalid Login Scenario with wrong username and password.");	 
	 }
	 
	
    @Test (priority = 0, description="Invalid Login Scenario with wrong username and password.", dataProvider = "browser-provider")
    public void invalidLoginTest_InvalidUserNameInvalidPasswordGOINGFORWARD (String category) throws InterruptedException {
        //ExtentReports Description
    	AssertionLibrary.assertEquals("ABC","ABC","String Matches"+category);
    	
    	AssertionLibrary.assertTrue(true,false, "BOOLEAN COMPARISON");
    	
    }
    @AfterMethod
    public void handleException()
    {
    	System.out.println(" i am in after method of login Test");
    	
    }

 

}

