package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformHorizontal {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//to launch the BROWSER
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));//to provide implicit wait 
		driver.get("https://omayo.blogspot.com/");//to launch weeb application 
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("windo.scrollBy(500,0)");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(-150 , 0)");
		Thread.sleep(3000);
		driver.close();
		
		
		
		
	}

}
