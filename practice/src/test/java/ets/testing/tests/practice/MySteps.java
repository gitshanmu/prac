package ets.testing.tests.practice;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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

	public void givenIAmInTheHomePageOfEnterprise() {
		System.out.println("GiVEN SECTIon");
		/* driver = new ChromeDriver(); */
		driver = new FirefoxDriver();
		driver.get("https://www.enterprise.com");
		homepage hp = new homepage(driver);
		hp.clickonrenttab();

	}

	@When(" i click the start car reservation tab")

	public void whenIClickTheStartCarReservationTab() {
		System.out.println("WHEN SECTIon");
		rentpage rp = new rentpage(driver);
		rp.start_car_reserv(driver);

	}
}