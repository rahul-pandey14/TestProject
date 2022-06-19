package e2eTesting;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Rahul Pandey\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		int j = 0;
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver
				.findElements(By.cssSelector("h4.product-name"));

		String[] items = { "Cucumber", "Brocolli", "Beetroot" };

		for (int i = 0; i < products.size(); i++) {

			String[] productsName = products.get(i).getText().split("-");
			String formattedName = productsName[0].trim();

			List itemsNeededList = Arrays.asList(items);

			if (itemsNeededList.contains(formattedName)) {

				j++;

				driver.findElements(
						By.xpath("//div[@class='product-action']/button"))
						.get(i).click();

				if (j == items.length) {
					break;
				}

			}

		}

	}

}
