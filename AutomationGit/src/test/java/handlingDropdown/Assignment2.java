package handlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Rahul Pandey\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("Rahul Pandey");
		System.out.println(name.getText());
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("rahulpandey23@gmail.com");
		System.out.println(email.getText());
		driver.findElement(By.id("exampleInputPassword1"))
				.sendKeys("rahul@1234#");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dropdown = driver
				.findElement(By.id("exampleFormControlSelect1"));

		Select drpdwn = new Select(dropdown);
		drpdwn.selectByVisibleText("Male");

		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("04-04-1993");
		driver.findElement(By.cssSelector("input[type='submit']")).click();

		String SuccessMsg = driver
				.findElement(By.cssSelector(
						"div[class='alert alert-success alert-dismissible']"))
				.getText();
		System.out.println(SuccessMsg);
		Assert.assertTrue(SuccessMsg.contains(
				"Success! The Form has been submitted successfully!."));

	}

}
