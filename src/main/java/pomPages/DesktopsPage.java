package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage {
	

	@FindBy(xpath="//div[@class='col-sm-6 text-start']//ul//li//a[text()='2']") private WebElement page2;
	
	
	@FindBy(xpath="//a[text()='Contact Us']") private WebElement  contactusbtn;
	
	

	
	
	public DesktopsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	



	public void Page2()
	{
		page2.click();
	}





	public void  Contactusbutton()
	{
		contactusbtn.click();
	}
	
	
	
}
