package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Diiferent_TypesOf_DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanke\\eclipse-workspace\\AutomationPractice\\Drivers\\chrome_V120.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		
		Thread.sleep(2000);
		
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		for(int i=1; i<=4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
