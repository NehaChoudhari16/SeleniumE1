package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedmethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    driver.get("http://www.instagram.com/");
	    
	    WebElement loginButton = driver.findElement(By.xpath("//div[text()='log in']"));
	 boolean result = loginButton.isDisplayed();
	   System.out.println(result);
	}

}
