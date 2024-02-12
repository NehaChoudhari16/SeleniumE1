package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	public static void main(String[] args) throws InterruptedException {
  	
		
		WebDriver driver = new ChromeDriver();  // to launch the web application.
		Thread.sleep(1000);
		driver.manage().window().maximize();  // to maximize the the window
		Thread.sleep(1000);
     
		driver.get("https://omaya.blogstop.com/");  // to launch the web application
		Thread.sleep(1000);
        
		
		driver.findElement(By.linkText("Open a popup window")).click();  // to open a new(child) browser window
		Thread.sleep(1000);
		
		
		// driver.close();
		driver.quit();   // to close parent as well as child browwser window
		
		
		
	}

}
