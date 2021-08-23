import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement text = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		text.sendKeys("uni");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
        System.out.println(driver.findElement(By.xpath("//input[@id='autocomplete']")).getText());
        
        
        JavascriptExecutor js= (JavascriptExecutor)driver;
        String script = "return document.getElementById(\"autocomplete\").value;";
        String text1 =  (String) js.executeScript(script);
        System.out.println(text1);
        int i =0;
        while(!text1.equalsIgnoreCase("United Kingdom (UK)"))
        {
        	i++;
        	driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
        	text1=(String) js.executeScript(script);
        	System.out.println(text1);
        	if(i>10)
        	{
        	break;
        	}

        	
        }
        if(i>10)
        {
        System.out.println("Element not found");
        }
        else
        {
        System.out.println("Element  found");
        }

      

  {
	  
  }

 

		

	}

}
