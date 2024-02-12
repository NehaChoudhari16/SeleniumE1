package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByWebElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver =new ChromeDriver(); //to store reference with chromedriver class
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(5000);
		
	WebElement loginButton = driver.findElement(By.xpath("//div[text() = 'Log in']"));
	
		File src = loginButton.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/loginButton.png");
		
		Files.copy(src, dest);//to copy the screenshot in  specificed folder		
	}

}
