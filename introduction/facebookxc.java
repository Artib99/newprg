package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\eclipse\\chromedrive.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("un");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("pw");
		//driver.findElement(By.cssSelector("button[name='login']")).click();
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	

}
