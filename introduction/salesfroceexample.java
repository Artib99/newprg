package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class salesfroceexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\eclipse\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		
		/*System.setProperty("webdriver.Chrome.driver", "C:\\eclipse\\chromedrive.exe");
		WebDriver driver = new ChromeDriver();*/
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("myusername");
		driver.findElement(By.name("pw")).sendKeys("mypass");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		
	}

}
