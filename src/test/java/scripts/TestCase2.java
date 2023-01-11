package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pomPages.MacBookProPage;
import pomPages.OpenCartLoginPage;
import pomPages.OpenCartOpenSourceShoppingCartSolutionPage;
import pomPages.StoreFrontAndAdministrationDemoPage;
import pomPages.YourStoreHomePage;

public class TestCase2 extends BaseClass {

	@Test
	public void tc2() throws IOException, InterruptedException
	{
OpenCartOpenSourceShoppingCartSolutionPage sp=new OpenCartOpenSourceShoppingCartSolutionPage(driver);
	
	sp.Loginbutton();
	
	OpenCartLoginPage lp=new OpenCartLoginPage(driver);
	lp.Usernametextbox(pdata.getdata("username"));
	lp.Passwordtextbox(pdata.getdata("password"));
	lp.clickonloginbtn();
	driverutilities.scrollByJavascriptExecutor(driver, 0, 100);
	lp.InputPinTextBox(pdata.getdata("pin"));
	lp.ClickOnContinueButton();
	
	StoreFrontAndAdministrationDemoPage dp=new StoreFrontAndAdministrationDemoPage(driver);
	dp.demobutton();
	dp.viewfrontstorebutton();
	driverutilities.switchTabs(driver);
	
	YourStoreHomePage hp=new YourStoreHomePage(driver);
	driverutilities.moveToElement(driver, hp.getLaptopsnotebooksbtn());
	
	hp.ShowallLaptopsNotebooksButton();
	
	
	//scroll to make the elements hp & macbookAir visible so tht it clicks on compare
	driverutilities.scrollByJavascriptExecutor(driver, 0, 400);
	
	hp.HpLp3065CompareButton();
	hp.MacBookProCompareButton();
	
	
	//scroll to make the elements  macbook-pro visible so tht it clicks 
	driverutilities.scrollByJavascriptExecutor(driver, 0, 1500);
	
	
	
	hp.MacBookProButton();
	
	MacBookProPage pp=new MacBookProPage(driver);
	pp.MacBookWishListButton();
	pp.MacBookAddtocartbtn();
	
//	Thread.sleep(7000);
//	pp.ItemsButton();
//	pp.ViewCartButton();
	
	
//login is not working while automating coz of tht we r nt able to add products to cart or wish list
	
	//we are not working on it anymore 
	
	
	
	
	}	
	
	
}
