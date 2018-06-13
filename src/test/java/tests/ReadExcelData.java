package tests;

import java.util.Map;

import org.cts.utils.ExcelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcelData {

	@Test(dataProvider = "readExcel")
	public void readExcelData_Test(Map<String, String> input) {

		System.out.println(input.get("name"));
	}

	@DataProvider
	public Object[][] readExcel() throws Exception {
		Object[][] testObjArray = ExcelReader.readData("Book1", "Sheet1");
		return (testObjArray);

	}

}
