package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreFrontAndAdministrationDemoPage {

	
	
	@FindBy(xpath="(//a[text()='Demo'])[1]") private WebElement demobtn;
	
	
	
	@FindBy(xpath="//a//span[text()='View Store Front']") private WebElement viewfrontstore;
	
	
	
	@FindBy(xpath="//span[text()='View Administration']") private WebElement viewadministration;
	
	
	public  StoreFrontAndAdministrationDemoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void demobutton()
	{
		demobtn.click();
	}
	
	
	public void viewfrontstorebutton()
	{
		viewfrontstore.click();
	}
	
	
	public void viewadministrationbutton()
	{
		viewadministration.click();
	}
	
	
	
	
	
	
}
