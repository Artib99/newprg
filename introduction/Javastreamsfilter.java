package introduction;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Javastreamsfilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("Rice");
		List<WebElement> items = driver.findElements(By.xpath("//tr/td[1]"));
		
	List<WebElement> veggies=items.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList());
Assert.assertEquals(items.size(), veggies.size());
	}

}
