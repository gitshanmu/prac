package others;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selectdate {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.enterprise.com");
			WebElement dynamic = (new WebDriverWait(driver,20)).until(ExpectedConditions.presenceOfElementLocated(By.className("date-label pickupCalendar-label")));
			dynamic.sendKeys("Sacramento",Keys.RETURN);
			
		} catch (Exception e) {
			System.out.println("Cannot Open the page");
		}
		
//date-label pickupCalendar-label
	}

}
