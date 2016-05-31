package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class homepage {
	
	@FindBy(how=How.XPATH,using=".//*[@id='primary-nav']/ul/li[1]/div/div[1]")
	private WebElement renttab;
	
	@FindBy(how=How.XPATH,using="//li[@class='primary-item active']//div[@class='menu cols-4']")
	private WebElement renttabdropdown;
	private  WebDriver driver;
	/*@FindBy(how=How.LINK_TEXT,using="Buy")
	private WebElement buytab;
	
	@FindBy(how=How.LINK_TEXT,using="Share")
	private WebElement sharetab;
	*/
	public homepage(WebDriver driver) {
		
		 this.driver = driver;
	        
	     PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	
	public homepage clickonrenttab(){
		System.out.println("HELLO");
		System.out.println(driver.getCurrentUrl());
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		String sText =  js.executeScript("return document.title;").toString();
		System.out.println("?88888888888888888888888888888888888888888");
		System.out.println(sText);
		System.out.println("?88888888888888888888888888888888888888888");*/
		
		renttab=driver.findElement(By.xpath(".//*[@id='primary-nav']/ul/li[1]/div/div[1]"));
		System.out.println("element found");
		renttab.isDisplayed();
		System.out.println("displayed");
		renttab.click();
		System.out.println("clicked");
		renttabdropdown.isDisplayed();
		return new homepage(driver);
	
	}
	/*public void clickonbuytab(){
		buytab.click();
	}
	public void clickonsharetab(){
		sharetab.click();
	}*/

}
