//package com.qsp.GeneralUtil;
//
//
//import java.io.File;
//import java.io.IOException;
//import java.time.Duration;
//import java.util.Set;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Navigation;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import com.google.common.io.Files;
//
//
//public class DriverUtil {
//
//		/**
//		 * This class is used to open the application 
//		 * @param driver is the webDriver refvariable which is used to fetch the browser
//		 * @param url is used to fetch the webApp url
//		 */
//	     public void oppenApp(WebDriver driver,String url)
//	     
//	     {
//	    	 driver.get(url);
//	     }
//	     /**
//	      * maximize page method is used to maximize the Web page
//	      * @param driver variable used to fetch browser
//	      */
//	     public void maximizePage(WebDriver driver)
//	     {
//	    	 driver.manage().window().maximize();
//	     }
//	     /**
//	      * minimize method is used to minimize the web page
//	      * @param driver variable used to fetch browser
//	      */
//	     public void minimize(WebDriver driver)
//	     {
//	    	 driver.manage().window().minimize();
//	     }
//	     /**
//	      * this method is used to refresh the web page
//	      * @param driver variable used to fetch browser
//	      */
//	     public void refreshPage(WebDriver driver)
//	     {
//	    	 Navigation nav=driver.navigate();
//	    	 nav.refresh();
//	     }
//	     /**
//	      * this method is used to go back  to privious  page
//	      * @param driver c
//	      */
//	     public void backWebPage(WebDriver driver)
//	     {
//	    	 driver.navigate().back();
//	     }
//	     /**
//	      * this method is used to go forward  in web page
//	      * @param driver variable used to fetch browser
//	      */
//	     public void forwardWebPage(WebDriver driver)
//	     {
//	    	 driver.navigate().forward();
//	     }
//	     /**
//	      * This method is used to verify checkbox in webpage
//	      * @param ele variable is used to fetch the address of web element of checkbox
//	      * @return it will return true if checkbox is selected else it well return false
//	      */
//	     public boolean isSelected(WebElement ele)
//	     {
//	    	 boolean status=ele.isSelected();
//	    	 return status;
//	     }
//	     /**
//	      * This method is used to verify h-over in webpage
//	      * @param ele variable is used to fetch the address of web element of checkbox
//	      * @return it will return true if H-over is displayed else it well return false
//	      */
//	     public boolean isDisplayed(WebElement ele)
//	     {
//	    	 boolean status=ele.isDisplayed();
//	    	 return status;
//	     }
//	     /**
//	      * This method is used to verify  in webpage
//	      * @param ele variable is used to fetch the address of web element of checkbox
//	      * @return it will return true if checkbox is selected else it well return false
//	      */
//	     public boolean isEnabled(WebElement ele)
//	     {
//	    	 boolean status=ele.isEnabled();
//	    	 return status;
//	     }
//	     public void scrollingHandel(WebDriver driver,WebElement ele)
//	     {
//	    	 JavascriptExecutor j=(JavascriptExecutor)driver;
//	    	 
//	    	 j.executeScript("arguments[0].ScrollIntoView()",ele);
//	     }
//	     /**
//	      * this method is used to move the crosser to pointed to element in web page
//	      * @param driver variable used to fetch browser
//	      * @param ele variable is used to fetch the address of web element 
//	      */
//	     public void moveTheCrossor(WebDriver driver,WebElement ele)
//	     {
//	    	 Actions act=new Actions(driver);
//	    	 act.moveToElement(ele).perform();
//	     }
//	     /**
//	      * this method is used to move the crosser to pointed to element in web page
//	      * @param driver variable used to fetch browser
//	      * @param ele variable is used to fetch the address of web element 
//	      */
//	     public void rightClick(WebDriver driver,WebElement ele)
//	     {
//	    	 Actions act=new Actions(driver);
//	    	 act.moveToElement(ele).contextClick().build().perform();
//	     }
//	     /**
//	      * this method is used to double click in element in web page
//	      * @param driver variable used to fetch browser
//	      * @param ele variable is used to fetch the address of web element 
//	      */
//	     public void doubleClick(WebDriver driver,WebElement ele)
//	     {
//	    	 Actions act=new Actions(driver);
//	    	 act.doubleClick().perform();
//	     }
//	     /**
//	      * this method is used to move the crosser to pointed to element in web page
//	      * @param driver variable used to fetch browser
//	      * @param ele variable is used to fetch the address of web element 
//	      */
//	     public void dragAndDrop(WebDriver driver,WebElement ele,WebElement ele1)
//	     {
//	    	 Actions act=new Actions(driver);
//	    	 act.dragAndDrop(ele, ele1).perform();
//	     }
//	     /**
//	      * this method is used to move the crosser to pointed to element in web page
//	      * @param driver variable used to fetch browser
//	      * @param ele variable is used to fetch the address of web element 
//	      */
//	     public void sliding(WebDriver driver,WebElement ele,int x,int y)
//	     {
//	    	 Actions act=new Actions(driver);
//	    	 act.dragAndDropBy(ele, x, y).perform();
//	     }
//	    /**
//	     * This method 
//	     * @param ele
//	     * @param atribute
//	     * @return
//	     */
//	     public String getAtribute(WebElement ele,String atribute)
//	     {
//	    	 ele.getAttribute(atribute);
//	    	 return atribute;
//	     }
//	     public void dropdownHandel(WebElement ele,int index)
//	     {
//	    	 Select s=new Select(ele);
//	    	 s.selectByIndex(index);
//	     }
//	     public void dropdownByValue(WebElement ele,String value)
//	     {
//	    	 Select s=new Select(ele);
//	    	 s.selectByValue(value);
//	     }
//	     public void takeScreenShot(WebDriver driver,String filepath)
//	     {
//	    	TakesScreenshot ss=(TakesScreenshot)driver; 
//	    	File src=ss.getScreenshotAs(OutputType.FILE);
//	    	File dist=new File(filepath);
//	    	try {
//				Files.copy(src, dist);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	     }
//	     public void implicitWait(WebDriver driver,int time)
//	     {
//	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
//	     }
//	     public void explicitWait(WebDriver driver,int time,String xpath)
//	     {
//	    	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
//	    	 wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
//	    	 
//	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
//	     }
//	      public void windowHandels(WebDriver driver,String tittle)
//	      {
//	    	  Set<String> allid=driver.getWindowHandles();
//	    	  for(String i:allid)
//	    	  {
//	    		  String currentUrl=driver.switchTo().window(i).getTitle();
//	    		  if(currentUrl.contains(tittle))
//	    		  {
//	    			  break;
//	    		  }
//	    	  }
//	      }
//	      public void alertAccept(WebDriver driver,WebElement ele)
//	      {
//	    	  Alert alt=driver.switchTo().alert();
//	    	  alt.accept();
//	      }
//	      
//	      public void alertcancel(WebDriver driver,WebElement ele)
//	      {
//	    	  Alert alt=driver.switchTo().alert();
//	    	  alt.dismiss();
//	      }
//	      }
//	}
//
//}
