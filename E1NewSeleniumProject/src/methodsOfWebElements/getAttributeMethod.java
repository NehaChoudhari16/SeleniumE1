package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeMethod {

	public static void main(String[] args) {
		WebDriver	driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    
	    driver.get("http://127.0.0.1/login.do");
	    
	    WebElement PasswordTB = driver.findElement(By.name("pwd"));
	    
	   String attributeValue = PasswordTB.getAttribute("class");
		
 		System.out.println(attributeValue);
		
	    
	}
}


