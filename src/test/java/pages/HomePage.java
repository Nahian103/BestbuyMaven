package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void DealOfTheDay() {
		driver.findElement(By.linkText("See Bonus Deals")).click();

	}
}
