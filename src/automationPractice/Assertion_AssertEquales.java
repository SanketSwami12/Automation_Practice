package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion_AssertEquales {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanke\\Downloads\\Selenium_Jar_Files\\drivers\\chromedriver_New.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().window().maximize();

		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000);

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for (int i = 1; i <= 4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		// now here we are use assertion concept

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		// System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		Thread.sleep(2000);

		driver.close();

	}

}
