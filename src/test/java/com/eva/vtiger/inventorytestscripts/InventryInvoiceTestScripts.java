
package com.eva.vtiger.inventorytestscripts;

import java.util.Map;

import com.eva.vtiger.base.BaseTest;
import com.eva.vtiger.pages.inventry.invoice.InventoryInvoiceNewCreateInvoice;
import com.eva.vtiger.utils.DataUtil;
import com.eva.vtiger.utils.WebUtil;

public class InventryInvoiceTestScripts extends BaseTest{
	
	///  requirement   Testing Logic  TestCase TestScript
	///  TDD -  Test Driven Development
	 BaseTest bsTst =new BaseTest();
	 WebUtil webUtil=bsTst.getWebUtil();

//	 @DataProvider()
//	 public Object[][] getTestCaseData() {
//            ///  excel data read 
// 			String[] dataArray1=new String[5];
//			dataArray1[0]="Man Singh";
//			dataArray1[1]="rahul";
//			dataArray1[2]="Kaushambi";
//			dataArray1[3]="pashchim Sharira";
//			dataArray1[4]="Utter Pradesh";
//			dataArray1[5]="India";
//
//			String[] dataArray2=new String[5];
//			dataArray2[0]="abcd";
//			dataArray2[1]="xyz";
//			dataArray2[2]="delhi";
//			dataArray2[3]="mondh";
//			dataArray2[4]="nhfghdtydtydtykd";
//			
//			
//			String[] dataArray3=new String[5];
//			dataArray3[0]="mno";
//			dataArray3[1]="fdfgdgf";
//			dataArray3[2]="vjhfh";
//			dataArray3[3]="hmgjhj";
//			dataArray3[4]="jhvjhjhjhj";
//			
//			String[][] dim2Array=	new String[3][5];
//			dim2Array[0]=dataArray1;
//			dim2Array[1]=dataArray2;
//			dim2Array[2]=dataArray3;
//
//		  return dim2Array;
//		 
//	 }
//
//	@Test(groups = {"Smoke"}, dataProvider = "getTestCaseData")
//	public void verifyVT006AccountAndContactAddOnInvoiceForm(String firstName, String accName, String city, String post, String address,String state,String country ) {
//		
//			webUtil.printMessage("====  verifyVT0012AccountAndContactAddOnInvoiceForm starts from here====");
//			getReuseCode().goToInventoryInvoiceLink();
//			getReuseCode().creatNewPluseButton();
//			InventoryInvoiceNewCreateInvoice creatInvoice= new InventoryInvoiceNewCreateInvoice(webUtil);
//			creatInvoice.fillUpInvoiceInformation(  firstName,   accName,   city,   post,   address,  state,  country,"Test Account Name And Contact Name Addition");
//			webUtil.printMessage("====  verifyVT0012AccountAndContactAddOnInvoiceForm ends from here====");
//
//	}
   ///  cadric beust 
	
	    /////   TestNG  JUnit
	
	   ////  Cucumber   -   BDD 
	 
	 
 
 
	public void verifyVT006AccountAndContactAddOnInvoiceForm(String firstName, String accName, String city, String post, String address,String state,String country ) {
		
			webUtil.printMessage("====  verifyVT0012AccountAndContactAddOnInvoiceForm starts from here====");
			DataUtil data=new DataUtil();
			Map<String, String> testcaseDataMap=data.getTestCaseData("VT0010");
			getReuseCode().goToInventoryInvoiceLink();
			getReuseCode().creatNewPluseButton();
			InventoryInvoiceNewCreateInvoice creatInvoice= new InventoryInvoiceNewCreateInvoice(webUtil);
			creatInvoice.fillUpInvoiceInformation( testcaseDataMap ,"Test Account Name And Contact Name Addition");
			webUtil.printMessage("====  verifyVT0012AccountAndContactAddOnInvoiceForm ends from here====");

	}
	
	
	
	
	
	
	
}
