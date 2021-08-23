package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class excerciseWH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
WebDriver driver =  new ChromeDriver();
driver.get("http://the-internet.herokuapp.com/");
driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
//driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText();
Set<String> ids = driver.getWindowHandles();
Iterator<String> it=ids.iterator();
String Parentid=it.next();
String childid=it.next();
driver.switchTo().window(childid);
System.out.println(driver.getTitle());

driver.switchTo().window(Parentid);
System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")));



	}

}
