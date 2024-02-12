package ActionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {

	public static void main(String[] args) {
		package actionsClassMethods;

		import java.time.Duration;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class ClickAndHold {

			public static void main(String[] args) throws InterruptedException {
			
				ChromeDriver driver = new ChromeDriver();  //TO launch the browser
				driver.manage().window().maximize();   //TO maximize the browser
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  //TO apply implicit wait the browser
				
				driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
				driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
				
				driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
				
				// To find the element to be clicked and hold
				 WebElement clickAndHold = driver.findElement(By.xpath("//div[@id='circle']"));
				
				 Actions act = new Actions(driver);  // To create the object of Actions class
				 act.clickAndHold(clickAndHold).perform();  // To perform click and hold operation
				
				 Thread.sleep(5000);
				 
				 act.release(clickAndHold).perform();// To perform  release operation on clicked webElement
				 		 	 
			}

		}