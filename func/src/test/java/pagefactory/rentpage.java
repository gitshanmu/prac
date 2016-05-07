package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class rentpage {

	// Start a Car Reservation
	@FindBy(how = How.LINK_TEXT, using = "Start a Car Reservation")
	private WebElement start_car_reserv;

	// Start a Moving Truck or Van Reservation
	@FindBy(how = How.LINK_TEXT, using = "Start a Moving Truck or Van Reservation")
	private WebElement start_truck_reserv;

	// View/Modify/Cancel

	// Get a Receipt

	// One-Way Car Rentals

	// Month or More Rentals®

	public void start_car_reserv(WebDriver driver) {
		start_car_reserv.click();
		//driver.getPageSource().contains("Car Rental Reservations");
		System.out.println(driver.getTitle()); 
	}

	public void start_truck_reserv(WebDriver driver) {
		start_truck_reserv.click();
		//driver.getPageSource().contains("Car Rental Reservations");
		System.out.println(driver.getTitle());
		

	}

}
