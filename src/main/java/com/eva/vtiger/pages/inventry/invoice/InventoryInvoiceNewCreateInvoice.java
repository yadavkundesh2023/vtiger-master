package com.eva.vtiger.pages.inventry.invoice;

import java.util.Map;

import com.eva.vtiger.pages.inventry.invoiceOr.InventoryInvoiceNewCreateInvoiceOr;
import com.eva.vtiger.utils.WebUtil;

public  class InventoryInvoiceNewCreateInvoice  extends InventoryInvoiceNewCreateInvoiceOr{

	//TB--TextBox
	//BT--Button
	//RB--Radio Button
	//LK--Link
	private WebUtil wt;
	
	public InventoryInvoiceNewCreateInvoice(WebUtil wu) {
		super(wu);
		this.wt=wu;
	}
	
//	public  String fillUpInvoiceInformation(String firstName, String accName, String city, String post, String address,String state,String country,String expSubjectName) {
//		wt.sendKeys(getExpSubjectNameTB(),expSubjectName);
//		wt.sendKeys(getCustomerNumberTB(), ""+expSubjectName+".er@gmail.com");
//		InventoryInvoiceNewCreateInvoiceCommonAdd commonAdd= new InventoryInvoiceNewCreateInvoiceCommonAdd(wt); 
//		wt.click(getSelectContactBT());
//		commonAdd.addElementName(firstName, firstName);
//		wt.sendKeys(getPurchaseOrderTB(), "Contact list");
//		wt.click(getAccountNameTB());
//		wt.myThread(2000);
//		commonAdd.addElementName(accName,accName);
//		wt.sendKeys(getBillingAddressTB(),address);
//		wt.sendKeys(getBillPoBoxTB(),post);
//		wt.sendKeys(getBillCityTB(), city);
//		wt.sendKeys(getBillStateTB(),state);
//		wt.sendKeys(getBillCodeTB(), "9856");
//		wt.sendKeys(getBillCountryTB(), country);
//		wt.click(getCopyBillingAddressRB());
//		wt.click(getProductLNK());
//		return expSubjectName;
//	}
	
	public  String fillUpInvoiceInformation( Map<String, String> testcaseDataMap,String expSubjectName) {
		wt.sendKeys(getExpSubjectNameTB(),expSubjectName);
		wt.sendKeys(getCustomerNumberTB(), ""+expSubjectName+".er@gmail.com");
		InventoryInvoiceNewCreateInvoiceCommonAdd commonAdd= new InventoryInvoiceNewCreateInvoiceCommonAdd(wt); 
		wt.click(getSelectContactBT());
//		commonAdd.addElementName(firstName, firstName);
//		wt.sendKeys(getPurchaseOrderTB(), "Contact list");
//		wt.click(getAccountNameTB());
//		wt.myThread(2000);
//		commonAdd.addElementName(accName,accName);
		wt.sendKeys(getBillingAddressTB(),testcaseDataMap.get("address"));
		wt.sendKeys(getBillPoBoxTB(),"");
		wt.sendKeys(getBillCityTB(), testcaseDataMap.get("city"));
		wt.sendKeys(getBillStateTB(),testcaseDataMap.get("state"));
		wt.sendKeys(getBillCodeTB(), "9856");
		wt.sendKeys(getBillCountryTB(), testcaseDataMap.get("country"));
		wt.click(getCopyBillingAddressRB());
		wt.click(getProductLNK());
		return expSubjectName;
	}


}
