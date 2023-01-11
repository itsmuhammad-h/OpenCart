package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourStoreHomePage {

	//testcase1
	@FindBy(xpath="//input[@name='search']") private WebElement searchtxtbox;
	
	@FindBy(xpath="	//a[text()='Desktops']") private WebElement Desktopbtn;
	
	@FindBy(xpath="//a[text()='Show All Desktops']") private WebElement  showalldesktopsbtn;
	
	
	//testcase2
	

	@FindBy(xpath="//li//a[text()='Laptops & Notebooks']") private WebElement laptopsnotebooksbtn;
	
	
	@FindBy(xpath="//div//ul//a[text()='Show All Laptops & Notebooks']") private WebElement showalllaptopsnotebooksbtn;
	
	

	@FindBy(xpath="(//div[@class='button-group']//button[@aria-label='Compare this Product'])[1]") private WebElement hplp3065comparebtn;
	
	
	@FindBy(xpath="(//div[@class='button-group']//button[@aria-label='Compare this Product'])[3]") private WebElement macbookaircomparebtn ;
	
	
	// bruh scroll here to click on macbookpro   
	@FindBy(xpath="//div//a[text()='MacBook Pro']") private WebElement macbookprobtn;
	
	
	
	public YourStoreHomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

//testcase1
//moving to the element[movetoElement()] so tht i can click on showalldesktopbutton
	public WebElement getDesktopbtn() {
		return Desktopbtn;
	}
	
	
	public void ShowAllDesktopButton()
	{
		showalldesktopsbtn.click();
	}
	
	
	
	
	//testcase2

	//movetoElement action needs to perform
		public WebElement getLaptopsnotebooksbtn() {
			return laptopsnotebooksbtn;
		}



		public void ShowallLaptopsNotebooksButton()
		{
			showalllaptopsnotebooksbtn.click();
		}
		
		//half page scroll is required
		public void HpLp3065CompareButton()
		{
			hplp3065comparebtn.click();
		}
		
		//half page scroll is required
		public void MacBookProCompareButton()
		{
			macbookaircomparebtn.click();
		}
		
		
		
		//scroll to end is required 
		public void MacBookProButton()
		{
			macbookprobtn.click();
		}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
