package uitests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagefactory.homepage;

public class NewTest2 {
	WebDriver driver;
	WebDriverWait wait;
	homepage hp;

	@BeforeClass
	public void Setup() throws InterruptedException {

		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 3);
		driver.get("https://www.enterprise.com");
		Thread.sleep(300);
		hp= PageFactory.initElements(driver, homepage.class);
	

	}

	@Test
	public void f() {
		hp.clickonrenttab();
      
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeTest
	public void beforeTest() {
	}

}
