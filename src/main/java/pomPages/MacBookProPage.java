package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MacBookProPage {
	
	

@FindBy(xpath="//div[@class='btn-group']//button[@aria-label='Add to Wish List']")private WebElement  macbookwishbtn;   
	
	
	
@FindBy(xpath="	//div//button[text()='Add to Cart']")private WebElement  macbookaddtocartbtn;   
	
	
	

	
	//used following-sibling to highlight the below element
	
@FindBy(xpath="//button[normalize-space()='7 item(s) - $12,100.00']")private WebElement  itemsbtn;
	
	



//click
@FindBy(xpath="//strong//i/following-sibling::text()[1]")private WebElement  viewcartbtn;
	
	




    public MacBookProPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void MacBookWishListButton()
	{
		macbookwishbtn.click();
	}
	
	public void MacBookAddtocartbtn()
	{
		macbookaddtocartbtn.click();
	}
	
	
	public void ItemsButton()
	{
		itemsbtn.click();
	}
	
	public void ViewCartButton()
	{
		viewcartbtn.click();
	}
	
}
