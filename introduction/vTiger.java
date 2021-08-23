package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vTiger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.Chrome.driver", "C:\\eclipse\\chromedrive.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		//driver.findElement(By.xpath("(//input[@name='selected_id'])[6]")).click();
		
		
	List<WebElement> checkbox =	driver.findElements(By.xpath("//input[@name=\"selected_id\"]"));
	
    checkbox.get(checkbox.size()-1).click();



		
		

	}

}
