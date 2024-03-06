package automationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Any_WebPage {

	public static void main (String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanke\\Downloads\\Selenium_Jar_Files\\drivers\\chromedriver_New.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		driver.get("https://www.saucedemo.com");
		
		driver.manage().window().maximize();
		
	//	Thread.sleep(3000);
		
//		WebElement UserNameField = driver.findElement(By.id("user-name"));
//	
//		UserNameField.sendKeys("standard_user");
		
		
		
//		WebElement PasswordFiled = driver.findElement(By.id("password"));
//		
//		PasswordFiled.sendKeys("secret_sauce");
//		
//		WebElement LoginButton = driver.findElement(By.id("login-button"));
//	
//		LoginButton.click();
		
		
		//*****************************************************************//
			// lets findout xpath through css selector
		
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("input#login-button")).click();
		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.close();
	}
	
	
	
	
	
}
