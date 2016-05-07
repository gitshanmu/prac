package uitests;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class NewTest {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void Setup() {

		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 3);

	}

	@Test(priority = 1)
	public void openpage() {
		driver.get("https://www.enterprise.com");
		WebElement dynamic = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pickupLocationTextBox")));
		dynamic.sendKeys("Sacramento", Keys.RETURN);
		WebElement autooptions = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='book']//ul[2]")));
		List<WebElement> optiontoselect = autooptions.findElements(By.tagName("li"));
		for (WebElement option : optiontoselect) {
			if (option.getText().equals("Sacramento, California, US")) {
				option.click();
				break;
			}

		}

	}

	@Test(priority = 2)
	public void selectdate() {
		WebElement pickupdate = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//label[@class='date-label pickupCalendar-label']")));
		pickupdate.click();
		WebElement calendar = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@id='book']//div[@class='pickup-calendar']//div[@class='days cf']")));

		List<WebElement> dates = calendar.findElements(By.tagName("div"));
		for (WebElement day : dates) {

			if (day.isEnabled() && day.getText().equalsIgnoreCase("7")) {
				day.click();
				break;

			}
			else
			{
				System.out.println("unable to click");
			}

		}

	}

}
