package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class rentpage {

	// Start a Car Reservation
	@FindBy(how = How.LINK_TEXT, using = "Start a Car Reservation")
	private WebElement start_car_reserv;

	// Start a Moving Truck or Van Reservation
	@FindBy(how = How.LINK_TEXT, using = "Start a Moving Truck or Van Reservation")
	private WebElement start_truck_reserv;

	private WebDriver driver;
	
	public rentpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver = driver;
	        //  Wait 20 Second To Find Element If Element Is Not Present
	        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	
	public rentpage start_car_reserv() {
		System.out.println("?INSIDE CAR RESERVE");
		System.out.println(driver.getCurrentUrl());
		start_car_reserv=driver.findElement(By.xpath(".//*[@id='primary-nav']/ul/li[1]/div/div[2]/div[1]/div[1]/ul/li[1]/a"));
		System.out.println("ELEMENT FOUND");
		start_car_reserv.click();
		//driver.getPageSource().contains("Car Rental Reservations");
		System.out.println(driver.getTitle());
		return new rentpage(driver);
	}

	public rentpage start_truck_reserv() {
		start_truck_reserv.click();
		//driver.getPageSource().contains("Car Rental Reservations");
		System.out.println(driver.getTitle());
		return new rentpage(driver);
		

	}

}
