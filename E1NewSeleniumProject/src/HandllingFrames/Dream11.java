package HandllingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		driver.get("https://www.dream11.com/");
		Thread.sleep(1000);

		// driver.switchTo().frame(0); (1st way) 
		//
		

		// driver.switchTo().frame("send-sms-iframe"); (2nd way)
		// Thread.sleep(2000);

		//to identify the frame by using web path
		WebElement frameelements = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));

		//to pass the reference of web elements
		driver.switchTo().frame(frameelements);
		
		//to perform operations on elements designed inside frame
		driver.findElement(By.id("regEmail")).sendKeys("8698081795");

	}

}
