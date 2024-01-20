package com.eva.vtiger.base;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {
	
	@DataProvider(name = "TestData")
	public Object[][] testData() {
		Object[][] data= {
				{"hi","hello"},
				{"hiiiii","helloooo"}
				};
		return data;
	}
	
	@Test(dataProvider = "TestData")
	public void testMethod(String data, String value) {
	    // Your test logic using data
	    System.out.println("Data: " + data + ", Value: " + value);
	}

}
