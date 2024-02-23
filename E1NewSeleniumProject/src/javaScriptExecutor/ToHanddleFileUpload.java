package javaScriptExecutor;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHanddleFileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();//to launch the BROWSER
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));//to provide implicit wait 
		driver.get("http://omayo.blogspot.com/");//to launch weeb application 

		Thread.sleep(3000);
		WebElement fileUpload = driver.findElement(By.id("uploadfile"));
		
		Actions act = new Actions( driver);	
		act.click( fileUpload).perform();
		Thread.sleep(3000);
		
	Runtime.getRuntime().exec("./autoItPrograms/File_Upload.exe");
	
	
	}

	

}
