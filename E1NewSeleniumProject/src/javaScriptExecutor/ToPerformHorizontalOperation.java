package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToPerformHorizontalOperation {

	private static final String JavascriptExecutor = null;
	private static Object javascriptexecutor;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//to launch the BROWSER
		driver.manage().window().maximize();//to maximize  the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));//to provide implicit wait 
		driver.get("https://www.selenium.dev/");//to launch weeb application 
		
		JavascriptExecutor js = (JavascriptExecutor)driver;//to type cast from driver to java script executor
		js.executeScript("window.scrollBy(0,1000)");
       
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		
	}

}
