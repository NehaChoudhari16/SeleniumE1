package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) {
		WebDriver	driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    
	    driver.get("http://127.0.0.1/login.do");
	    
	    
	    //To find username text box and store in a variable 
	   WebElement usnTB = driver.findElement(By.name("username"));
       usnTB.sendKeys("admin");// to paass the inputs to username textfield
       
       WebElement PasswordTB = driver.findElement(By.name("pwd"));  // to find pwd tB and store in a variable 
       PasswordTB.sendKeys("manager"); // to pass the inputs to password text box
       
	}

}
