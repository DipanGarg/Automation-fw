package tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.cts.utils.XmlParser;

public class XmlTester {
	
	public static final String WORKING_DIR=System.getProperty("user.dir");
	public static final String EXTENT_REPORTS_FOLDER=WORKING_DIR+"\\Resources\\TestFile.txt";
	static String line;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XmlParser xmlParser = new XmlParser();
		// reading a text file
		
		File file = new File(EXTENT_REPORTS_FOLDER);
		System.out.println("FILe PATH : "+file.getAbsolutePath());
		FileReader fReader = new FileReader(file);
		//FileInputStream fis = new FileInputStream(file);
		BufferedReader bReader = new BufferedReader(fReader);
		
	
		while ((line = bReader.readLine()) != null) {
			System.out.println("value in File = "+line);
		}
		bReader.close();
		
		
	}

}
