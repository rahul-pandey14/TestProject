package e2eTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetFlightBooking {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Rahul Pandey\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(
				By.cssSelector("div[data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath(
				"//div[@data-testid='to-testID-origin']//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']"))
				.sendKeys("Bengaluru");
		driver.findElement(By.xpath(
				"//div[@data-testid='to-testID-destination']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']"))
				.click();
		driver.findElement(By.xpath(
				"//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']"))
				.sendKeys("Delhi");
		// driver.findElement(By.xpath(
		// "//div[@class='css-1dbjc4n r-19h5ruw
		// r-136ojw6']//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']"))
		// .click();
		// driver.findElement(By.xpath(
		// "(//div[@class='css-1dbjc4n r-1awozwy r-14lw9ot r-1loqt21 r-eu3ka
		// r-1otgn73 r-1aockid']/div//div[text()='3'])[1]"))
		// .click();
		// driver.findElement(By.xpath(
		// "//div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n r-1awozwy
		// r-18u37iz r-1wtj0ep']"))
		// .click();

	}

}
