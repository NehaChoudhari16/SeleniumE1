package ActionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
	    
	    driver.findElement(By.xpath("//section[text() = 'Button']"));
	    driver.findElement(By.partialLinkText("Double Click"));
	    
	   WebElement yesButton = driver.findElement(By.id("btn20"));
	   WebElement noButton = driver.findElement(By.id("btn23"));
	   WebElement ratingButton = driver.findElement(By.id("btn26"));
	   
	   Actions act = new Actions(driver); // to create the object of the Actions class
	   
	   act.doubleClick(ratingButton).perform(); //to perform double click operation on rating (3) button 
	   act.doubleClick(noButton).perform();//to perform double click operation on no button 
	   act.doubleClick(yesButton).perform();//to perform double click operation on yesButton
	   
	   
	   
	   
	   
	   
	   
	    
	}

}
