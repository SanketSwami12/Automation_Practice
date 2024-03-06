package automationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive_Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sanke\\\\Downloads\\\\Selenium_Jar_Files\\\\drivers\\\\chrome_V120.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		
	List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	
	for(WebElement options1 :options)
	{
		if(options1.getText().equalsIgnoreCase("india"))
		{
			options1.click();
			break;
			
		}
	}
	System.out.println("TC is Pass");
		driver.close();
	}

}
