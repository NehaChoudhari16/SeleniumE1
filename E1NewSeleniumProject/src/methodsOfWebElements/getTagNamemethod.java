package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTagNamemethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    driver.get("http://127.0.0.1/login.do");
	    
	   WebElement loginButton = driver.findElement(By.id("loginButton")); //to find the login button 
	   String logintag = loginButton.getTagName(); // to get the tag name  of login button
	   System.out.println(logintag);  // to get the tag name of login button in console
	   
	   WebElement usn = driver.findElement(By.name("username")); // to find username textbox
	   String usnTag = usn.getTagName(); // to get the tag name of the username tb
	   System.out.println(usnTag); // to get tag name of username tb in console
	}

}
