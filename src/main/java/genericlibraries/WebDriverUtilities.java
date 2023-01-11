package genericlibraries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {

	
	
	
	
	//select class methods   //Dropdown
	public void DropdownSelectByVisibleText(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
		
		}
	
	public void selectByValue(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByValue(text);
		
		}
	
	public void selectByIndex(WebElement ele,int index)
	{
		Select s=new Select(ele);
		s.selectByIndex(index);
		
		}
	
	public void getOptionsOfDropDown(WebElement ele,WebDriver driver)
	{
		Select s=new Select(ele);
	List<WebElement> option= s.getOptions();
	
          int count=	option.size();
          System.out.println("count of dropdown list  :"+count);
          
          for(WebElement z:option)
          {
        	 String value= z.getText();
        	  System.out.println( "all options available in dropdown are :" +value);
          }
          
	} 
          
      	public void DropdownInSortedOrder(WebElement ele,WebDriver driver)
    	{
    		Select s=new Select(ele);
    	List<WebElement> option= s.getOptions();
    	
              int count=	option.size();
              System.out.println("count of dropdown list  :"+count);
              ArrayList<String> list=new ArrayList<String>();
              for(WebElement z:option)
              {
            	 String alltext= z.getText();
            	list.add(alltext);
            
              
              }
                Collections.sort(list);
    	
                for(Object sortedtext:list)
                {
                	System.out.println("sorted list of Dropdown"+sortedtext);
                }
    	}
          
    	

	
	
	
	//mouse hover Actions methods 
      	
	public void moveToElement(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
				
	}
	
	public void doubleClick(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
		
	}
	public void contextClick(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
	    act.contextClick(ele).perform();
	}
	
	public void dragAnddrop(WebDriver driver,WebElement src,WebElement dst)
	{
		Actions act=new Actions(driver);
	    act.dragAndDrop(src, dst).perform();
	    
	    
	}
	
	
	
	public void clickAndHold(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
	    act.clickAndHold(element).perform();
	    
	    }
	
	public void release(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
	    act.release(element).perform();
	    
	    
	}
	
	
	
	public void dragAnddropBy(WebDriver driver,WebElement src,int x,int y)
	{
		Actions act=new Actions(driver);
	   
	    act.dragAndDropBy(src, x, y).perform();
	    
	}
	
	
	public void  SwitchToAlert(WebDriver driver)
	{
	Alert a=driver.switchTo().alert();
	 String text=a.getText();
	 System.out.println( " captured text of popup is  : "+text);
	 a.accept();
	}
	
	 
	 public void switchFrame(WebDriver driver)
	 {
		 driver.switchTo().frame(0);
		 
	 }
	 
	 public void switchBackToMainFrame(WebDriver driver)
	 {
		 driver.switchTo().defaultContent();
		 
	 }
	 
	 public void switchTabs(WebDriver driver)
	 {
		Set<String> child = driver.getWindowHandles();
		for(String e:child)
		{
	   driver.switchTo().window(e).getTitle();
	   
		}
		 
	 }
	
	 
	 public void clickByJavascriptExecutor(WebDriver driver,WebElement element)
	 {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", element);
	 }
	 
	 
	 
	 public void scrollByJavascriptExecutor(WebDriver driver,int x,int y)
	 {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 // for vertical scroll down(0,300)
		 //for vertical scroll up(0,-300)
		 
		 //for horizontal right (300,0)
		 //for horizontal left(-300,0)
		 js.executeScript("window.scrollBy("+x+","+y+")");

	 }
	 
	 
		public void ScrollIntoView(WebDriver driver,WebElement element)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", element );
		
		
		}
		

		public void Scroll(WebDriver driver,WebElement element)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", element );
		
		
		}


          




















}
