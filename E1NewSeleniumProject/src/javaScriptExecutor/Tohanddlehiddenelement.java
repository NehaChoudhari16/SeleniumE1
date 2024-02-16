package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tohanddlehiddenelement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//to launch the BROWSER
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//to provide implicit wait 
		driver.get("https://www.facebook.com/signup");//to launch weeb application 
		
	   WebElement hiddenelements = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		//hiddenelements.sendKeys("qspiders");
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='qspiders'",hiddenelements);
		
		
		
	}

}
