package tests;

import java.io.FileNotFoundException;

import org.cts.configHandling.ConfigProvider;

public class ConfigTester {

	public static void main(String[] args) throws FileNotFoundException {

		   String hello = ConfigProvider.getInstance("config").getProperty("BROWSERNAME");
		   //String hello1 = ConfigProvider.getInstance().getProperty("database");
		   
			//System.out.println("reading from configprovider\n"+ hello +"\n"+hello1);
		   System.out.println("reading from configprovider\n"+ hello );

	}

}