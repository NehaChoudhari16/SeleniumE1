package HandllingPopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHanddlePromptAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//to launch the BROWSER
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));//to provide implicit wait 
		driver.get("https://omayo.blogspot.com/");//to launch weeb application 
		
	driver.findElement(By.id("prompt")).click();
	Thread.sleep(3000);
	
	
	Alert promptalert = driver.switchTo().alert();
	String promptText = promptalert.getText();	
	
	System.out.println(promptText);
	Thread.sleep(3000);
	
	promptalert.sendKeys("Hello Nehaaaaaaaaa"); //to give input 
	
	Thread.sleep(3000);
	//to click on ok button
	promptalert.accept();
	
	}

}
