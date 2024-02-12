package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledmethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    driver.get("https://demoapps.qspiders.com/");
	    
	    WebElement nameTextfiled = driver.findElement(By.id("name"));
      boolean result = nameTextfiled.isEnabled();
        System.out.println(result);
	}

}
