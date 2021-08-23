package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\eclipse\\IEDriverServer.exe" );
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

	}

}
