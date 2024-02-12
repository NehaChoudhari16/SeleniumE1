package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) {
	WebDriver	driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
    
    driver.get("http://127.0.0.1/login.do");
    
    //To find login button and store in a variable
    WebElement loginButton = driver.findElement(By.id("loginButton")); // To find elements
      loginButton.click();  // to click on login buttun 
    
	}

}
