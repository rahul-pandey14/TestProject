package handlingDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Pandey\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);

		List<WebElement> options = driver
				.findElements(By.xpath("//li[@class='ui-menu-item']/a"));

		for (WebElement option : options) {

			if (option.getText().equalsIgnoreCase("Indonesia")) {

				option.click();
				break;

			}

		}

		Thread.sleep(3000);
		driver.close();
	}
}
