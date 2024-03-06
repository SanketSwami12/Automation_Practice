package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Handling {
	
	public static void main(String args[])
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanke\\Downloads\\Selenium_Jar_Files\\drivers\\chromedriver_New.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//before selecting checkbox, to make sure check box is selected or not for that we can use isSelected method
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		
		
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
	
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		
		
		// now i want to check how many checkbox is available in webpages
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		System.out.println("Tc is pass");
	
		driver.close();
	}
	
}
