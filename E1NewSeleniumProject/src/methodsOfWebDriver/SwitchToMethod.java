package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();  //To launch ChromeDriver
		Thread.sleep(2000);
		driver.get("http://www.google.co.in/");   //To launch web application
		Thread.sleep(2000);
         Object keys;
		driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);		
		
		
	}

}
