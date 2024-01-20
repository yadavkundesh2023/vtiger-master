package com.eva.vtiger.pages.commonOr;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.eva.vtiger.utils.WebUtil;

import lombok.Getter;

@Getter
public class CommonReusableCodesOr {

	public CommonReusableCodesOr(WebUtil wt) {
		PageFactory.initElements(wt.getDriver(),this);// 8 byte
	}
	
	//     _______________ login ___________________

	@CacheLookup
	@FindBy (xpath="//input[@name='user_name']")
	private WebElement userNameTB;

	@CacheLookup      
	@FindBy (xpath="//input[@name='user_password']")
	private WebElement passwordTB;

	@CacheLookup  
	@FindBy (xpath="//input[@title='Login [Alt+L]']")
	private WebElement loginBT;

	//   _______________ logOut ___________________

	@CacheLookup 
	@FindBy (xpath="//a[text()='Sign Out']")
	private WebElement signOutBT;

	//  _______________ creatNewPluseButton ___________________

	

	@CacheLookup 
	@FindBy (xpath="//img[contains(@title,'Create ') or @title='']")
	private WebElement creatNewPluseBT;

	//  _______________ searchForElement ___________________

	@CacheLookup
	@FindBy (xpath="//input[@name='search_text']")
	private WebElement searchforTB;

	@CacheLookup 
	@FindBy (xpath="//div[@id='basicsearchcolumns_real']//select[@id='bas_searchfield']")
	private WebElement selectTypeDD;

	@CacheLookup   
	@FindBy (xpath="//input[@name='submit']")
	private WebElement searchButtonBT;

	//  _______________ saveButton ___________________

	@CacheLookup   
	@FindBy (xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBT;

	//  _______________ searchForElement ___________________

	@CacheLookup 
	@FindBys( @FindBy(xpath="//table[@class='lvtBg']//tr[1]//td"))
	private List<WebElement> listColumns;

	@CacheLookup 
 @FindBys(@FindBy (xpath="//table[@class='lvtBg']//tr"))
	private List<WebElement> weRowsList;
	
//  _______________ Marketing ___________________

	@CacheLookup 
	@FindBy (xpath="//a[text()='Marketing']")
	private WebElement marketingLK;

	@CacheLookup 
	@FindBy (xpath="//div[@id='Marketing_sub']//a[text()='Campaigns']")
	private WebElement MarketingCampaignsLK;

	@CacheLookup 
	@FindBy (xpath="//div[@id='Marketing_sub']//a[text()='Accounts']")
	private WebElement MarketingAccountsLK;

	@CacheLookup
	@FindBy (xpath="//div[@id='Marketing_sub']//a[text()='Contacts']")
	private WebElement MarketingContactsLK;

	@CacheLookup
	@FindBy (xpath="//div[@id='Marketing_sub']//a[text()='Webmail']")
	private WebElement MarketingWebmailLK;

	@CacheLookup
	@FindBy (xpath="//div[@id='Marketing_sub']//a[text()='Leads']")
	private WebElement MarketingLeadsLK;

	@CacheLookup
	@FindBy (xpath="//div[@id='Marketing_sub']//a[text()='Calendar']")
	private WebElement MarketingCalendarLK;

	@CacheLookup
	@FindBy (xpath="//div[@id='Marketing_sub']//a[text()='Documents']")
	private WebElement MarketingDocumentsLK;
	
	//     _______________ Sales ___________________

	@CacheLookup 
	@FindBy (xpath="//a[text()='Sales']")
	private WebElement SalesLK;

	@CacheLookup
	@FindBy (xpath="//div[@id='Sales_sub']//a[text()='Leads']")
	private WebElement SalesLeadsLK;

	@CacheLookup 
	@FindBy (xpath="//div[@id='Sales_sub']//a[text()='Accounts']")
	private WebElement SalesAccountsLK;

	@CacheLookup
	@FindBy (xpath="//div[@id='Sales_sub']//a[text()='Contacts']")
	private WebElement SalesContactsLK;

	@CacheLookup 
	@FindBy (xpath="//div[@id='Sales_sub']//a[text()='Potentials']")
	private WebElement SalesPotentialsLK;

	@CacheLookup
	@FindBy (xpath="//div[@id='Sales_sub']//a[text()='Quotes']")
	private WebElement SalesQuotesLK;

	@CacheLookup
	@FindBy (xpath="//div[@id='Sales_sub']//a[text()='Sales Order']")
	private WebElement SalesSalesOrderLK;

	@CacheLookup 
	@FindBy (xpath="//div[@id='Sales_sub']//a[text()='Invoice']")
	private WebElement SalesInvoiceLK;
	
	@CacheLookup
	@FindBy (xpath="//div[@id='Sales_sub']//a[text()='Price Books']")
	private WebElement SalesPriceBooksLK;
	
	@CacheLookup 
	@FindBy (xpath="//div[@id='Sales_sub']//a[text()='Documents']")
	private WebElement SalesDocumentsLK;
	
	@CacheLookup 
	@FindBy (xpath="//div[@id='Sales_sub']//a[text()='Calendar']")
	private WebElement SalesCalendarLK;

//_______________ Inventory ___________________

	@CacheLookup
	@FindBy (xpath="//a[text()='Inventory']")
	private WebElement InventoryLK;

	@CacheLookup 
	@FindBy (xpath="//div[@id='Inventory_sub']//a[text()='Products']")
	private WebElement InventoryProductsLK;

	@CacheLookup
	@FindBy (xpath="//div[@id='Inventory_sub']//a[text()='Vendors']")
	private WebElement InventoryVendorsLK;

	@CacheLookup
	@FindBy (xpath="//div[@id='Inventory_sub']//a[text()='Price Books']")
	private WebElement InventoryPriceBooksLK;
	
	@CacheLookup
	@FindBy (xpath="//div[@id='Inventory_sub']//a[text()='Purchase Order']")
	private WebElement InventoryPurchaseOrderLK;

	@CacheLookup  
	@FindBy (xpath="//div[@id='Inventory_sub']//a[text()='Sales Order']")
	private WebElement InventorySalesOrderLK;
	
	@CacheLookup 
	@FindBy (xpath="//div[@id='Inventory_sub']//a[text()='Quotes']")
	private WebElement InventoryQuotesLK;

	@CacheLookup 
	@FindBy (xpath="//div[@id='Inventory_sub']//a[text()='Invoice']")
	private WebElement InventoryInvoiceLK;
	
	@CacheLookup  
	@FindBy (xpath="//div[@id='Marketing_sub']//a[text()='Services']")
	private WebElement InventoryServicesLK;
	 
	@CacheLookup 
	@FindBy (xpath="//div[@id='Inventory_sub']//a[text()='Assets']")
	private WebElement InventoryAssetsLK;

	
	

}
