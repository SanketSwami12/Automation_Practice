package automationPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Firefox_Launch {
	
	public static void main(String args [])
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sanke\\Downloads\\Selenium_Jar_Files\\drivers\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.youtube.com/");
	
	}

}
