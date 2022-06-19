package handlingDropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Pandey\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"))
				.click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		System.out.println(
				driver.findElement(By.xpath("//a[@value='BLR']")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"))
				.click();
		System.out.println(driver.findElement(By.xpath(
				"//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"))
				.getText());

		Thread.sleep(5000);
		driver.quit();

	}

}
