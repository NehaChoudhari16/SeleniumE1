package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submitMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    driver.get("http://www.instagram.com/");
	    
	    driver.findElement(By.name("username")).sendKeys("Neha");
	    driver.findElement(By.name("password")).sendKeys("I love you mom");
	    WebElement loginButton = driver.findElement(By.xpath("//div[text() = 'Log in']"));
	    loginButton.submit();
		
		   
	}

}
