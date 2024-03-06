package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_DropDown {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sanke\\\\Downloads\\\\Selenium_Jar_Files\\\\drivers\\\\chrome_V120.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select s = new Select(dropdown);
		
		s.selectByIndex(2);
	System.out.println(s.getFirstSelectedOption().getText());	
	
		s.selectByValue("USD"); //this will select about attribute value
		
	System.out.println(s.getFirstSelectedOption().getText());
		

		s.selectByVisibleText("INR");
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		driver.close();
		//how to know if the dropdown is static or dynamic
		//usually most of the time if html text is tart with select tag name then its static dropdown
		// this above methods only use if select class is in html text
		
		
		
		
		
	}

}
