package genericlibraries;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public WebDriver driver;
	
public 	WebDriverUtilities driverutilities=new WebDriverUtilities();
public	PropertyFileData pdata=new PropertyFileData();  //must hve public access otherwise we cant acess
	
	@BeforeMethod
	public void openApp() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    driver.get(pdata.getdata("url"));   // here we hve to change the return type of getdata() method  propertyFile class to String from void 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
	
	
	
	}
	
	
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException, InterruptedException
	{
 int status = res.getStatus();
 String name=res.getName();
	if(status==2)
	{
		Photo p=new Photo();
	
		p.getphoto(driver, name);
	}
	Thread.sleep(2000);
	driver.quit();
	}






}


