package ActionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RealeseMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver(); // to launch the browser 
	    driver.manage().window().maximize(); //to maximize the screen
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
	   
	    driver.findElement(By.xpath("//section[text()= 'Mouse Actions']"));
	    driver.findElement(By.xpath("//section[text()= 'Drag & Drop']"));
	    driver.findElement(By.partialLinkText("Drag Option")).click();
	    
	    driver.findElement(By.xpath("//section[text()= 'Mouse Actions']")).click();
	    driver.findElement(By.xpath("//section[text()= 'Click & Hold']")).click();
	    
	    //to find the element to be clicked and hold =
	   WebElement clickanhold = driver.findElement(By.xpath("//div[@id= 'circle']"));
	    
	  Actions act = new Actions(driver); //to create the object of actions class
	    act.clickAndHold(clickanhold).perform(); //to perform click and hold operation
	    Thread.sleep(5000);
	    act.release(clickanhold).perform();//to realese the clicked
	}

}
