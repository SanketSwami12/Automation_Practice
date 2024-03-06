package automationPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dynamic_Dropdown {

	public static void main(String artgs[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sanke\\\\Downloads\\\\Selenium_Jar_Files\\\\drivers\\\\chrome_V120.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='PAT']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@value='VGA'])[2]")).click();
		
		System.out.println("Test case is pass");
		
		driver.close();
		
		
	}
}
