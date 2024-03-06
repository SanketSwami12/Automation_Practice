package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sanke\\\\Downloads\\\\Selenium_Jar_Files\\\\drivers\\\\chromedriver_New.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		//to maximize window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// now im in google website so i wants to navigate google to youtube 
		driver.navigate().to("https://youtube.com");
		Thread.sleep(2000);
		
		
		// now im in youtube website page now again i wants to go google
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		// now im in google again i want to go youtube
		driver.navigate().forward();
		Thread.sleep(2000);
		
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
