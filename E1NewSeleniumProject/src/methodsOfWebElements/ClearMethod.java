package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    
	    driver.get("http://127.0.0.1/login.do");
	    
	       //To find username text box and store in a variable 
		   WebElement usnTB = driver.findElement(By.name("username"));
	       usnTB.sendKeys("admin");// to paass the inputs to username textfield
	       
	       Thread.sleep(2000);
	       usnTB.clear();  // To clear the text pesent in username text box
	    
	    
	}

}


