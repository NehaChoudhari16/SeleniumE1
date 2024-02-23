package HandllingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByusingindexOfFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		driver.get("https://www.dream11.com/");
		
		
		driver.switchTo().frame(0); 
		driver.findElement(By.id("regEmail")).sendKeys("8698081795");

		
	}

}
