package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByBrowserSpesificClass {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver =new ChromeDriver(); //to store reference with chromedriver class
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		

	   File src = driver.getScreenshotAs(OutputType.FILE); /// to take the screen shot webpage 
	   File dest = new File("./Screenshot/facebook.png"); //  to specify the name location and extension
		Files.copy(src, dest); // to copy and paste the screenshot  in to specific foldeer
		
		
		
	}

}
