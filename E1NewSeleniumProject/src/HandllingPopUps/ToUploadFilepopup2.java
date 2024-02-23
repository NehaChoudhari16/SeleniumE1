package HandllingPopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUploadFilepopup2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//to launch the BROWSER
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));//to provide implicit wait 
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");//to launch web application 
		
		Thread.sleep(2000);
		driver.findElement(By.id("//input[@id='myFile']")).sendKeys("C:\\Users\\Dell\\Documents\\Neha CV\\Prefinal.pdf");
		
		
		
		
	}

}
