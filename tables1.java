import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		int sum=0;
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/32167/17th-match-bangabandhu-t20-cup-2020");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();//row count
int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	
for(int i=0;i<count-2;i++)
{
String values =  table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
int totalvalues = Integer.parseInt(values);
sum= sum+totalvalues;
}
System.out.println(sum);

System.out.println(driver.findElement(By.cssSelector("//div[text()='Extras']/following-sibling::div")).getText());
	}

}
