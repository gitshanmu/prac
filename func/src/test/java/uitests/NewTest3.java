package uitests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagefactory.homepage;
import pagefactory.rentpage;

public class NewTest3 {
	WebDriver driver;
	WebDriverWait wait;
	homepage hp;
	rentpage rp;

  @Test
  public void f1() {
	  rp.start_car_reserv(driver);
	
  }
  @Test
  public void f2() {
	  rp.start_car_reserv(driver);
	
  }
  @BeforeMethod
  public void beforeMethod() {
	  hp.clickonrenttab();
	 	    
  }
  /*@AfterMethod
  public void afterMethod() {
	  hp.clickonrenttab();
	 	    
  }*/

  @BeforeClass
  public void setup() {
	  driver = new ChromeDriver();
	  driver.get("https://www.enterprise.com");
	  hp=PageFactory.initElements(driver,homepage.class);
	  rp=PageFactory.initElements(driver,rentpage.class);
  }

}
