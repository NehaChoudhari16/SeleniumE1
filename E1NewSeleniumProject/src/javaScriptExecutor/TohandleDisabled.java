package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TohandleDisabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//to launch the BROWSER
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));//to provide implicit wait 
		driver.get("https://demoapps.qspiders.com/ui");//to launch weeb application 
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Disabled']"));
		Thread.sleep(3000);
		
		WebElement disabledTextbox = driver.findElement(By.id("name"));
		//to type cast into java script executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//to pass input to disabled elemennts
		js.executeScript("document.getElementById('name').value='admin'");
		
		Thread.sleep(3000);
		
		//to clear the content from disabled text box
		//js.executeScript("document.getElementById('name').value= ''");
		
		
		//js.executeScript("documents.getElementsById('name).value =");
	
		js.executeScript("argument[0].value= ''",disabledTextbox);
		
		
	}

}
