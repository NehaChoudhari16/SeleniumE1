package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class BydownCasting {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.co.in");
		
		RemoteWebDriver rwd =(RemoteWebDriver) driver;
	    
		
		File src = rwd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/google.jpg");
		
		Files.copy(src, dest);
		
	}

}
