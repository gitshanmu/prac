package ets.testing.tests.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.jbehave.core.annotations.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import pagefactory.homepage;
import pagefactory.rentpage;

public class MySteps {
	WebDriver driver;
	WebDriverWait wait;

	@Then(" i should be redirected to the car reservation page")
	public void thenIShouldBeRedirectedToTheCarReservationPage() {
		System.out.println("THEN SECTIon");

	}

	@Given("i am in the home page of enterprise")

	public void givenIAmInTheHomePageOfEnterprise() throws IOException {
		System.out.println("GiVEN SECTIon");
		/* driver = new ChromeDriver(); */
		
//		//FOR FIRE FOX 
//		driver = new FirefoxDriver();
//		driver.get("https://www.enterprise.com");
		File file = new File("C:/Users/Karthikeyan/Downloads/phantomjs-2.1.1-windows/bin/phantomjs.exe");
		//System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true);
		caps.setCapability("takescreenshot", true);
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,file.getAbsolutePath());
		WebDriver driver = new PhantomJSDriver(caps);
		driver.get("https://www.enterprise.com");
		Dimension targetSize = new Dimension(1280, 1024);
		driver.manage().window().setSize(targetSize);
		
		
		homepage hp = new homepage(driver);
		hp.clickonrenttab();
		File scrFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:/Users/Karthikeyan/Downloads/testScreenShot444.jpg")); 
		

	}

	@When(" i click the start car reservation tab")

	public void whenIClickTheStartCarReservationTab() {
		System.out.println("WHEN SECTIon");
		rentpage rp = new rentpage(driver);
		rp.start_car_reserv();

	}
}