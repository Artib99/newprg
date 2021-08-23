package introduction;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.google.common.base.Predicate;

public class WebTableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//span[contains(text(),'Veg/fruit name')]")).click();
		//capture all elements into the list
		List<WebElement> elementlist = driver.findElements(By.xpath("//tr/td[1]"));
		// capture all webelements into the new(orginal) list
		List<String> originalist = elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort on the original list
		
		List<String> sortedlist = originalist.stream().sorted().collect(Collectors.toList());
		//compare original list versus sorted list
		Assert.assertTrue(sortedlist.equals(originalist));
		List<String> price;
		do {
			
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		//scan the colunm with getText for Beans-> once beans found -> print the price of beans
	 price =rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
	price.forEach(s->System.out.println(s));
	if(price.size()<1)
	{
		driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
	}
		}while(price.size()<1);
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String beansprice = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return beansprice;
	}

}
