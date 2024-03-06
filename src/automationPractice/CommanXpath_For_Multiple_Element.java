package automationPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommanXpath_For_Multiple_Element {

	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanke\\Downloads\\Selenium_Jar_Files\\drivers\\chromedriver118.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};





		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

		addItems(driver,itemsNeeded);

		}

		public static  void addItems(WebDriver driver,String[] itemsNeeded)

		{

		int j=0;

		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

		for(int i=0;i<products.size();i++)

		{

		//Brocolli - 1 Kg

		//Brocolli,    1 kg

		String[] name=products.get(i).getText().split("-");

		String formattedName=name[0].trim();

		//format it to get actual vegetable name

		//convert array into array list for easy search

		//  check whether name you extracted is present in arrayList or not-

		List itemsNeededList = Arrays.asList(itemsNeeded);

		if(itemsNeededList.contains(formattedName))

		{

		j++;

		//click on Add to cart

		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

		if(j==itemsNeeded.length)

		{

		break;

		}

		}

		}

		}



		}


		
//		String[] items= {"Cucumber","Brocolli"};
//		
//		List<WebElement> products =driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
//		
//		for(int i=0; i<products.size(); i++)
//		{
//			String[] name=products.get(i).getText().split("-");
//			String formatedName=name[0].trim();
//			
//			List itemslist = Arrays.asList(items);
//		
//		if(itemslist.contains(name))
//		{
//			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//			
//		}
//		
//		
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//	}
//}
