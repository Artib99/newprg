package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[contains(@value,'Date')]")).click();
		List<WebElement> dates = driver.findElements(By.cssSelector(".day"));
		
		int count = driver.findElements(By.className(".day")).size();
		for(int i=0;i<count;i++)
		{
			String text = driver.findElements(By.className(".day")).get(i).getText();
			 if(text.equalsIgnoreCase("23"))
			 {
				 driver.findElements(By.className(".day")).get(i).click();
				 break;
			 }
		}

	}

}
