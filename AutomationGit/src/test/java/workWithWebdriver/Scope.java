package workWithWebdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Pandey\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int links = driver.findElements(By.tagName("a")).size();
		System.out.println(links);

		WebElement limitedDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(limitedDriver.findElements(By.tagName("a")).size());

		WebElement footerDriver = limitedDriver
				.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		for (int i = 1; i < footerDriver.findElements(By.tagName("a"))
				.size(); i++) {

			String clickOnLinksTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			footerDriver.findElements(By.tagName("a")).get(i)
					.sendKeys(clickOnLinksTab);

		}
		Thread.sleep(3000);

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();

		while (itr.hasNext()) {

			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}

	}
}
