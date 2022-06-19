package e2eTesting;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Rahul Pandey\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();

		driver.switchTo().window(childId);
		System.out.println(driver
				.findElement(By.xpath("//h3[text()='New Window']")).getText());

		driver.switchTo().window(parentId);
		System.out.println(driver
				.findElement(By.xpath("//h3[text()='Opening a new window']"))
				.getText());

	}

}
