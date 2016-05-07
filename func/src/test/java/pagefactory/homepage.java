package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homepage {
	
	@FindBy(how=How.XPATH,using="//*[@id='primary-nav']//li[@tabindex='1']//div[@class='primary-nav-label']")
	private WebElement renttab;
	
	@FindBy(how=How.XPATH,using="//li[@class='primary-item active']//div[@class='menu cols-4']")
	private WebElement renttabdropdown;
	
	/*@FindBy(how=How.LINK_TEXT,using="Buy")
	private WebElement buytab;
	
	@FindBy(how=How.LINK_TEXT,using="Share")
	private WebElement sharetab;
	*/
	
	
	public void clickonrenttab(){
		renttab.click();
		renttabdropdown.isDisplayed();
	
	}
	/*public void clickonbuytab(){
		buytab.click();
	}
	public void clickonsharetab(){
		sharetab.click();
	}*/

}
