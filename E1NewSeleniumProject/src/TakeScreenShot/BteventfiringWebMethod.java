package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class BteventfiringWebMethod {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver =new ChromeDriver(); //to store reference with chromedriver class
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		
       EventFiringWebDriver efwd = new EventFiringWebDriver (driver); //to creat the object
		
	File src = efwd.getScreenshotAs(OutputType.FILE); //to take the screenshort of the web page 
		
		File dest = new File("./Screenshot/instagram.png");
		
       Files.copy(src, dest);		//to copy and paste the screenshot in th3e spcific folder 
	}

}
