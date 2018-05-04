package tests;

import java.io.FileNotFoundException;

import org.cts.configHandling.ConfigProvider;

public class ConfigTester {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		   String hello = ConfigProvider.getInstance().getProperty("dbpassword");
		   String hello1 = ConfigProvider.getInstance().getProperty("BROWSERNAME");
		   
			System.out.println("reading from configprovider\n"+ hello +"\n"+hello1);

	}

}
