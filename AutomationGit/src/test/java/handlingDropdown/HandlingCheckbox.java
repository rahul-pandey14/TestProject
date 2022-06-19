package handlingDropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Pandey\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Assert.assertFalse(driver
				.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"))
				.isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"))
				.click();
		int checkboxsize = driver
				.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(checkboxsize);

		Assert.assertTrue(driver
				.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"))
				.isSelected());
	}

}
