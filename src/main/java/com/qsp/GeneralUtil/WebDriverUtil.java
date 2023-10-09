package com.qsp.GeneralUtil;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverUtil {

	/**
	 * This method is used to open the WebApplication using webDriver refVeribale and it will fetch the url.
	 * @param driver is the ref.variable of webDriver
	 * @param url It is used to fetch the url of the Application and load the page
	 */
	public void openApp(WebDriver driver,String url)
	{
		driver.get(url);
	}
	
	/**
	 * This method is used to maximize the browser
	 * @param driver is the ref.variable of webDriver
	 */
	public void maximizeBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * This method is used to minimize the browser
	 * @param driver is the ref.variable of webDriver
	 */
	public void minimizeBrowser(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	
	/**
	 * This method is used to fetch the title of the page
	 * @param driver is the ref.variable of webDriver
	 * @param title It will fetch the title of the webPage
	 * @return It will return the string type data of webPage 
	 */
	public String fetchTitleOfThepage(WebDriver driver,String pagetitle)
	{
		String title= driver.getTitle();
		
		return title;
	}
	
	/**
	 * This method is used to fetch the current url of the page
	 * @param driver is the ref.variable of webDriver
	 * @param title It will fetch the current url of the webPage
	 * @return It will return the string type data of webPage 
	 */
	public String fetchCurrentUrl(WebDriver driver,String crrenturl)
	{
		String title= driver.getCurrentUrl();
		
		return title;
	}
	
	/**
	 * This method is used to Refresh the webApplication
	 * @param driver is the ref.variable of webDriver
	 */
	public void refreshWebApplication(WebDriver driver)
	{
		driver.navigate().refresh();
	}
	
	/**
	 * This method is used to go back in the webApplication
	 * @param driver is the ref.variable of webDriver
	 */
	public void backWebApplication(WebDriver driver)
	{
		driver.navigate().back();
	}
	
	/**
	 * This method is used to go forward in the webApplication
	 * @param driver is the ref.variable of webDriver
	 */
	public void forwardWebApplication(WebDriver driver)
	{
		driver.navigate().forward();
	}
	
	/**
     * This method is used to select the checkBox in webPage
     * @param ele is a variable used to fetch the address of web element of checkBox
     * @return It will return true if checkBox is selected else it well return false
     */
    public boolean isSelected(WebElement ele)
    {
   	 boolean status=ele.isSelected();
   	 return status;
    }
    
    /**
     * This method is used to verify h-over in webPage
     * @param ele variable is used to fetch the address of web element of checkBox
     * @return it will return true if H-over is displayed else it well return false
     */
    public boolean isDisplayed(WebElement ele)
    {
   	 boolean status=ele.isDisplayed();
   	 return status;
    }
    
    /**
     * This method is used to verify  in webPage
     * @param ele variable is used to fetch the address of web element of checkBox
     * @return it will return true if checkBox is selected else it well return false
     */
    public boolean isEnabled(WebElement ele)
    {
   	 boolean status=ele.isEnabled();
   	 return status;
    }
    
    /**
     * This method is used to move the cursor pointed to element in web page
     * @param driver variable used to fetch browser
     * @param ele variable is used to fetch the address of web element 
     */
    public void moveTheCrossor(WebDriver driver,WebElement ele)
    {
   	 Actions act=new Actions(driver);
   	 act.moveToElement(ele).perform();
    }
    
    /**
     * This method is used to move the cursor pointed to element in web page and perform right click on it.
     * @param driver variable used to fetch browser
     * @param ele variable is used to fetch the address of web element 
     */
    public void rightClick(WebDriver driver,WebElement ele)
    {
   	 Actions act=new Actions(driver);
   	 act.moveToElement(ele).contextClick().build().perform();
    }
    
    /**
     * This method is used to double click in element in web page
     * @param driver variable used to fetch browser
     * @param ele variable is used to fetch the address of web element 
     */
    public void doubleClick(WebDriver driver,WebElement ele)
    {
   	 Actions act=new Actions(driver);
   	 act.doubleClick().perform();
    }
    
    /**
     * This method is used to move the slider in a web page(Example- dragging the price slider in flipkart)
     * @param driver variable used to fetch browser
     * @param ele variable is used to fetch the address of web element 
     */
    public void dragAndDrop(WebDriver driver,WebElement ele,WebElement ele1)
    {
   	 Actions act=new Actions(driver);
   	 act.dragAndDrop(ele, ele1).perform();
    }
    
    /**
     * 
     * @param ele is the ref.variable of the element 
     * @param attribute 
     * @return
     */
    public String getAtribute(WebElement ele,String attribute)
    {
   	 ele.getAttribute(attribute);
   	 return attribute;
    }
    
    /**
     * This method is used to handle the dropDown menu by selecting 
     * @param ele
     * @param index
     */
    public void dropdownHandel(WebElement ele,int index)
    {
   	 Select s=new Select(ele);
   	 s.selectByIndex(index);
    }
    
    public void dropdownByValue(WebElement ele,String value)
    {
   	 Select s=new Select(ele);
   	 s.selectByValue(value);
    }
    
    /**
     * This method is used to take screenshot of the failed test cases
     * @param driver is the ref.variable of webDriver
     * @param filepath It is the path where the screenshot is stored
     */
    public void screenShot(WebDriver driver,String filepath)
    {
    	TakesScreenshot sh=(TakesScreenshot)driver;
    	
    	File src=sh.getScreenshotAs(OutputType.FILE);
    	
    	File disc= new File(filepath);
    	
    	try {
			Files.copy(src, disc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
    /**
     * This method is used to handle synchronization issue
     * @param driver
     */
	public void implicitWait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
}
