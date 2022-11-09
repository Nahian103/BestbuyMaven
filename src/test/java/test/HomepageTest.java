package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomepageTest extends BaseTest {
	@Test
	public void deal() {
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		HomePage TheDeal = new HomePage(driver);
		TheDeal.DealOfTheDay();

		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL,
				"https://www.bestbuy.com/site/misc/deal-of-the-day/pcmcat248000050016.c?id=pcmcat248000050016");

	}

}
