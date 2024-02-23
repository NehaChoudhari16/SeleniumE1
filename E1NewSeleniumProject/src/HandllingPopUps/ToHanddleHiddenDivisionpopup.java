package HandllingPopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHanddleHiddenDivisionpopup {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();//to launch the BROWSER
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));//to provide implicit wait 
		driver.get("https://www.makemytrip.com/");//to launch weeb application 

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Departure']"));

		
		driver.findElement(By.xpath("//div[text()= 'March 2024']/ancestor::div[@class ='DayPicker-Month']/descendant:: p[text()= '25']")).click();
		//driver.findElement(By.xpath("//div[text()='March 2024']/../..//p[text()= '25']"));

       Thread.sleep(4000);
       driver.close();
		
		
		
		
	}
	
	
	
	
	
	
	

}
