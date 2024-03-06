package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Microsfot_Edge_Launch {

	public static void main(String args[]) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\sanke\\Downloads\\Selenium_Jar_Files\\drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://youtube.com");
		
	}
	
	
}
