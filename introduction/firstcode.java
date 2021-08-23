package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.Chrome.driver", "C:\\eclipse\\chromedrive.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/*driver.findElement(By.id("email")).sendKeys("my username");
		driver.findElement(By.name("pass")).sendKeys("mypass");
		driver.findElement(By.linkText("Forgotten password?")).click(); */
		driver.findElement(By.cssSelector("#email")).sendKeys("myusername");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("mypass");
		driver.findElement(By.xpath("//*[@id=\'u_0_a\']/div[3]/a")).click();
	}

}
