package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

	@FindBy(xpath="//input[@id='input-name']") private WebElement nametxtbox;
	
	
	
	

	@FindBy(xpath="	//input[@id='input-email']") private WebElement emailtxtbox;
	
	@FindBy(xpath="//div[@class='col-sm-10' ]//textarea[@id='input-enquiry']") private WebElement enquirytxtbox;
	

	
	
	
	@FindBy(xpath="	//div//button[text()='Submit']") private WebElement submitbtn;
	
	

	@FindBy(xpath="//a[text()='Continue']") private WebElement continuebtn;

	
	
	
	
	
	
	public ContactUsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}
		
		
	
	//whenever we use send keys we hve to declare a String and pass it as parameter
	public void NameTextBox(String name)
	{
		
		nametxtbox.sendKeys(name);
	}
	
	public void EmailTextBox(String email)
	{
		emailtxtbox.sendKeys(email);
	}
	
	
	public void Enquirytxtbox(String enquiry) {
		enquirytxtbox.sendKeys(enquiry);
	}
	

	
	public void Submitbutton()
	{
		submitbtn.submit();
	}


	
	
	
	public void ClickOnContinueButton()
	{
		continuebtn.click();
	}
	
	
	
	
	
	
	
	
	
}
