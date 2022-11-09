package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TopDealPage;

public class TopDealsTest extends BaseTest {
	@Test
	public void dealsTest() throws InterruptedException {
		driver.manage().window().maximize();
		TopDealPage TheDeals = new TopDealPage(driver);
		TheDeals.TopDeals();

		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL,
				"https://www.bestbuy.com/site/electronics/top-deals/pcmcat1563299784494.c?id=pcmcat1563299784494");

	}

}
