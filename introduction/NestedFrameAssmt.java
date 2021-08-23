package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameAssmt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath(" //a[contains(text(),'Nested Frames')]")).click();
		//driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@frameborder='1']")));

	}

}
