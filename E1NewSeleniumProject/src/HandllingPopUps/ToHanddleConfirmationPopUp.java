package HandllingPopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHanddleConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//to launch the BROWSER
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));//to provide implicit wait 
		driver.get("https://omayo.blogspot.com/");//to launch weeb application 
		
		driver.findElement(By.id("confirm")).click();	
		Thread.sleep(3000);
	Alert confirmatioAlert = driver.switchTo().alert();
	Thread.sleep(2000);
	confirmatioAlert.accept();
	
		
		
		
	}

}
