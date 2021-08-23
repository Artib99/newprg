package introduction;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(5000);
		ChromeOptions options=new ChromeOptions();

		Map<String, Object> prefs=new HashMap<String,Object>();

		prefs.put("profile.default_content_setting_values.notifications", 1);

		//1-Allow, 2-Block, 0-default

		options.setExperimentalOption("prefs",prefs);
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Select s=new Select(driver.findElement(By.id("adults")));
		s.selectByValue("6");
		driver.findElement(By.id("Childrens"));
		s.selectByValue("2");
		driver.findElement(By.id("Infants"));
		s.selectByValue("1");
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");
		driver.findElement(By.id("SearchBtn")).click();
		
		
		

	}

}
