package automationPractice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BeautymnlLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanke\\Downloads\\Selenium_Jar_Files\\drivers\\chromedriver_New.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://beautymnl.com/s/on-sale");
		
		driver.manage().window().maximize();
		
		WebElement AcceptCookies = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[2]/a"));
		
		AcceptCookies.click();
	
		WebElement CreateAnAccount = driver.findElement(By.linkText("Create Account"));
		
		CreateAnAccount.click();
		
		System.out.println("Clicked on Create account Btn");
		
		//----------------------------------------------------//
			// Create new account //
		
		WebElement EmailAddress = driver.findElement(By.id("data_email"));
		
		EmailAddress.sendKeys("sankets1293@gmail.com");
		
		System.out.println("Email Entered");
		
		WebElement CreatePassword = driver.findElement(By.id("data_password"));
		
		CreatePassword.sendKeys("Sanket@12");
		
		System.out.println("Password Entered");
		
		WebElement ClickOnContinueWithMail = driver.findElement(By.id("create-account-button"));
		
		ClickOnContinueWithMail.click();
		
		System.out.println("Clicked on btn");
		
		driver.quit();
		
		//-------------------------------------------//
			//Enter Personal data //
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
}
