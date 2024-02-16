package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollTillpPrticularwebElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//to launch the BROWSER
		driver.manage().window().maximize();//to maximize  the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));//to provide implicit wait 
		driver.get("https://www.selenium.dev/");//to launch weeb application 
		
	WebElement scrollTarget = driver.findElement(By.xpath("//h2[text() ='News']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;//to type cast from driver to java script executor
		js.executeScript("arguments[0].scrollIntoView(true)",scrollTarget);
		
		
	}

}
