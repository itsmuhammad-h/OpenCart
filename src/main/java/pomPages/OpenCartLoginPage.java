package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenCartLoginPage {

	
	
	@FindBy(id="input-email") private WebElement usernametxtbox;
	
	
	@FindBy(id="input-password") private WebElement passwordtxtbox;
	
	
	@FindBy(xpath="(//button[text()='Login'])[1]") private WebElement loginbtn;
	
	//input pin text box 
	@FindBy(xpath="	//input[@id='input-pin']") private WebElement inputpintxtbox;
	
	
	//clicking on continue after entering pin 
    @FindBy(xpath="	//button[text()='Continue']") private WebElement continuebtn;
	
	
	public OpenCartLoginPage(WebDriver driver)
	{
       
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	public void  Usernametextbox(String username) {
		
		usernametxtbox.sendKeys(username);
	}




	public void Passwordtextbox(String password) {
		 
		passwordtxtbox.sendKeys(password);
		
	}
	
	
	

	
	public void clickonloginbtn()
	{
		loginbtn.click();
	}


	public void InputPinTextBox(String pin)
	{
		inputpintxtbox.sendKeys(pin);
	}
	
	
	public void ClickOnContinueButton()
	{
		continuebtn.click();
	}
	
	
}
