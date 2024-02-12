package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    driver.get("http://127.0.0.1/login.do");
	    
	   WebElement loginButton = driver.findElement(By.id("loginButton")); // to find login button and store in a variable 
	  String cssValue = loginButton.getCssValue("background"); // to get css value for use the background 
	    System.out.println(cssValue);  // to print the recived value in the console 
   
  String color = loginButton.getCssValue("color"); // to get the color (value) of login button 
  System.out.println(color);  // to print the values in the console )
	    
	}

}
