package org.cts.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Constants {

	public static final String WORKING_DIR=System.getProperty("user.dir");
	public static final String TIME_STAMP = new SimpleDateFormat("dd.MM.yyyy.HH.mm").format(new Date());
	public static final String EXTENT_REPORTS_FOLDER="\\AutomationReports\\";
	public static final String EXTENT_REPORTS_FILENAME = "ExtentReport_";
	public static final String EXTENT_REPORTS_PATH =WORKING_DIR + EXTENT_REPORTS_FOLDER + EXTENT_REPORTS_FILENAME+TIME_STAMP+".html";
	public static final String ENCODING_UTF8 = "utf-8";
}
