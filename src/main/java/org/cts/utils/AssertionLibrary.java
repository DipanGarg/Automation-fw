package org.cts.utils;

import org.cts.reporter.ExtentTestManager;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

/**
 * class that gives access to different Assertion methods:
 * 
 * @author hp
 *
 */

public class AssertionLibrary {

	public static void assertEquals(String actual, String expected, String message) {
		Assert.assertEquals(actual, expected, message);
		ExtentTestManager.getTest().log(Status.PASS, message);
	}

	public static void assertTrue(boolean actual, boolean expected, String message) {
		Assert.assertEquals(actual, expected, message);
		ExtentTestManager.getTest().log(Status.PASS, message);
	}

}
