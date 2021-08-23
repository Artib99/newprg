import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mothercare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.mothercare.in/login?login_with=telephone");
        driver.findElement(By.xpath("//input[@id='input-registration-firstname']")).sendKeys("Arathi");
        driver.findElement(By.xpath("//input[@id='input-registration-lastname']")).sendKeys("B");
        driver.findElement(By.xpath("//input[@id='input-registration-email']")).sendKeys("aarthiballamudi@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-registration-password']")).sendKeys("Arathi#123");
        driver.findElement(By.xpath("//input[@id='input-registration-telephone']")).sendKeys("7676343499");
        driver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/form[1]/div[2]/div[1]/input[1]")).click();
        
        

	}

}
