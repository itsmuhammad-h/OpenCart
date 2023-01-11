package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenCartOpenSourceShoppingCartSolutionPage {



	@FindBy(xpath="//a[@class='btn btn-link navbar-btn' and text()='Login']") private WebElement login;
	
	
	public OpenCartOpenSourceShoppingCartSolutionPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void Loginbutton()
	{
		login.click();
	}
	
	
	
}
