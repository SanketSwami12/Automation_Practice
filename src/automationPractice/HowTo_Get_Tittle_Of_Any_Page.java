package automationPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HowTo_Get_Tittle_Of_Any_Page {
	
	/**
	 * @param args
	 */
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sanke\\\\Downloads\\\\Selenium_Jar_Files\\\\drivers\\\\chromedriver_New.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
	
		driver.getTitle();
		
		// to see the title in console window u just add the printing statment starting of the method like
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
	//	System.out.println(driver.getPageSource());
		
	//	System.out.println(driver.getWindowHandle());
		
		//System.out.println(driver.getClass());
	
		driver.close();
	
		//System.out.println(driver);
	}

}
