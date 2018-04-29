package org.cts.reporter;

import static org.cts.utils.Constants.*;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

//OB: ExtentReports extent instance created here. That instance can be reachable by getInstance() method.

public class ExtentManager {

	private static ExtentReports extent;

	public static ExtentReports getInstance() {
		if (extent == null) {
			createReportsFolder(EXTENT_REPORTS_FOLDER);
			createInstance(EXTENT_REPORTS_PATH);
		}
		return extent;
	}
	
	private static void createReportsFolder(String folderName){
	     File file = new File(WORKING_DIR+folderName);
	        if (!file.exists()) {
	            if (file.mkdir()) {
	                System.out.println("Directory is created!");
	            } else {
	                System.out.println("Failed to create directory!");
	            }
	        }
	}

	public static ExtentReports createInstance(String fileName) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setDocumentTitle("DipanGarg-AutomationReports");
		htmlReporter.config().setEncoding(ENCODING_UTF8);
		htmlReporter.config().setReportName("Automation-Reports");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		return extent;

	}
}
