package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopDealPage {
	WebDriver driver;

	public TopDealPage(WebDriver driver) {
		this.driver = driver;
	}

	public void TopDeals()  throws InterruptedException {
		driver.findElement(By.linkText("Top Deals")).click();
		Thread.sleep(3000);
		List<WebElement> addToCartButtons = driver.findElements(By.className("add-to-cart-button"));
		System.out.println(addToCartButtons.size()); 
		addToCartButtons.get(1).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".c-button-link.continue-shopping")).click();
		driver.findElement(By.xpath("/html//div[@id='site-control-content']/div[@class='widget-container']/div[@class='container']/div[6]/div[@class='col-xs-12']/div/div[@class='col-xs-12']/div//div[@class='cb-content']/div[@class='wf-offer-row wf-row-4up']/div[2]//div[@class='wf-offer-price-block']//div[@class='wf-embedded-a2c']/div/div[@class='_none']//button[@type='button']")).click();
		driver.findElement(By.className("c-button c-button-secondary c-button-sm c-button-block ")).click();
	}
}
