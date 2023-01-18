package scripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import genericlibraries.BaseClass;
import pomPages.ContactUsPage;
import pomPages.DesktopsPage;
import pomPages.OpenCartLoginPage;
import pomPages.OpenCartOpenSourceShoppingCartSolutionPage;
import pomPages.StoreFrontAndAdministrationDemoPage;
import pomPages.YourStoreHomePage;

public class TestCase1  extends BaseClass{

//opens the browser
//enters url https://www.opencart.com
//clicks on login 
//login page gets opened
//enter user&password and clicks on login
//clicks on demo
//viewfrontview &administration page opens
//clicks on viewfrontview
//homepage gets opened
//mouse hovers on Desktop &clicks on show all desktops
//scrolls till down and clicks on page2
//again scrolls down and clicks on contactPage &enters name,email,enquiry,clicks on submit &clicks on continue
//once clicking on continue it will redirect to the homepage 
	
	@Parameters({"T1"})
	@Test
	public void tc1() throws IOException, InterruptedException
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

//checking page is navigated with the expected title
 String title=driver.getTitle();
 String expected="OpenCart - Your Account";
assertEquals(title, expected);
Reporter.log("LoginPage Navigated with expected title  ",true);


//bcoz of security reasons url token keeps changing we cannot validate url sorry....
/*
 String currenturl = driver.getCurrentUrl();
 String urlexpected="https://www.opencart.com/index.php?route=account/";
assertEquals(currenturl, urlexpected);

Reporter.log(" page Navigated with expected url ",true);
*/		
		
StoreFrontAndAdministrationDemoPage fa =new StoreFrontAndAdministrationDemoPage(driver);
fa.demobutton();


//store front and administration page title validation
String demopagetitle=driver.getTitle();
String demotitleexpected="OpenCart - Demo";
assertEquals(demopagetitle, demotitleexpected);
Reporter.log("DemoPage StoreFront&Administration Navigated with expected title  ",true);
				
		
fa.viewfrontstorebutton();




driverutilities.switchTabs(driver);

YourStoreHomePage hp=new YourStoreHomePage(driver);


//homepage title validation 
String hometitle=driver.getTitle();
String hometitleexpected="Your Store";
assertEquals(hometitle, hometitleexpected);
Reporter.log("HomePage Navigated with expected title  ",true);

 
driverutilities.moveToElement(driver, hp.getDesktopbtn());

hp.ShowAllDesktopButton();



DesktopsPage tp=new DesktopsPage(driver);


//use getters getpage2 buttton requires scroll action 

driverutilities.scrollByJavascriptExecutor(driver, 0, 2000);

tp.Page2();
driverutilities.scrollByJavascriptExecutor(driver, 0, 1500);

tp.Contactusbutton();



ContactUsPage up=new ContactUsPage(driver);
driverutilities.scrollByJavascriptExecutor(driver, 0, 700);
up.NameTextBox(pdata.getdata("name"));
up.EmailTextBox(pdata.getdata("email"));
up.Enquirytxtbox(pdata.getdata("enquiry"));

up.Submitbutton();
up.ClickOnContinueButton();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
