package automationPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumManager {

	public static void main (String args[]) 
	{
		// in selenium manger we dont need to write whole code
		// like System.setProperty("", "") here we are give the chrome
		// driver path manually so insted of this we can directly use
		// below code
		// here we only create the object of webdriver
		
		WebDriver driver = new ChromeDriver();
		
	}
	
}
