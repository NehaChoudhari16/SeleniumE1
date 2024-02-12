package ActionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementsMethod {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.flipkart.com/");
    
    WebElement homeAndFurniture = driver.findElement(By.xpath("//span[text() = 'Home & Furniture']"));
    
    Actions act = new Actions(driver);
    act.moveToElement(homeAndFurniture).perform();
    
    
    
	}

}
