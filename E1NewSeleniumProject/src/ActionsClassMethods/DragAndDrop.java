package ActionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();  //TO launch the browser
		driver.manage().window().maximize();   //TO maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  //TO apply implicit wait the browser
		
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.partialLinkText("Drag Position")).click();
		
		//Mobiles and Laptops source WebElements
		WebElement mobileChargerSource = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		
		WebElement laptopChargerSource = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		
		WebElement mobileCoverSource = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		
		WebElement laptopCoverSource = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		//Mobiles and Laptops Target WebElements
		WebElement mobileAccessoriesTarget = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		
		WebElement laptopAccessoriesTarget = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
	
	    Actions act = new Actions(driver);//To create the object of Actions class
	    
	  //To drag and Drop the webElements into respective target area.
	    act.dragAndDrop(mobileChargerSource, mobileAccessoriesTarget).perform();
	    act.dragAndDrop(laptopChargerSource, laptopAccessoriesTarget).perform();
	    act.dragAndDrop(mobileCoverSource, mobileAccessoriesTarget).perform();
	    act.dragAndDrop(laptopCoverSource, laptopAccessoriesTarget).perform();
	}

}