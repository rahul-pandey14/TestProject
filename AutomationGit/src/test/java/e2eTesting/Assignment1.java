package e2eTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Rahul Pandey\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, 5);
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learning");
		driver.findElement(By.xpath("//span[text()=' User']")).click();

		Thread.sleep(3000);
		driver.findElement(By.id("okayBtn")).click();

		WebElement dropdown = driver
				.findElement(By.xpath("//select[@data-style='btn-info']"));

		Select drpdwn = new Select(dropdown);
		drpdwn.selectByIndex(2);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//a[text()='iphone X']")));
		driver.findElement(By.xpath("//a[text()='iphone X']")).click();

	}

}
