package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedmethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    driver.get("http://127.0.0.1/login.do");
	    
	   WebElement checkbox = driver.findElement(By.name("remember"));
	   checkbox.click();
	     boolean result = checkbox.isSelected();
	    System.out.println(result);
	}

}
