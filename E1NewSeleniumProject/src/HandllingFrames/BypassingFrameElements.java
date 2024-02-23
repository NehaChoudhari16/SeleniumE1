package HandllingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BypassingFrameElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		driver.get("https://www.dream11.com/");
		
		WebElement frameelements = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));	//to identify the frame by using web path
		driver.switchTo().frame(frameelements);	//to pass the reference of web elements
		driver.findElement(By.id("regEmail")).sendKeys("8698081795");//to perform operations on elements designed inside frame


	}

}
