package handlingDropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Pandey\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		Assert.assertFalse(
				driver.findElement(By.id("checkBoxOption1")).isSelected());

		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		checkbox.click();
		checkbox.click();
		Assert.assertFalse(
				driver.findElement(By.id("checkBoxOption1")).isSelected());

		System.out.println(driver
				.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
