package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrelloDragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://trello.com/");
		//click on login button
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("username")).sendKeys("priti9gaikwad@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.id("password")).sendKeys("ayansh@85");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//div[@title='E1']")).click();
		
		//for source element
		WebElement javaSrc=driver.findElement(By.xpath("//a[text()='JAVA']"));
		WebElement sqlSrc = driver.findElement(By.xpath("//a[text()='SQL']"));
		WebElement apiSrc = driver.findElement(By.xpath("//a[text()='API']"));
		WebElement manualSrc = driver.findElement(By.xpath("//a[text()='Manual Testing']"));
		WebElement seleniumSrc = driver.findElement(By.xpath("//a[text()='Selenium']"));
		
		//for target element
		WebElement mockGiven = driver.findElement(By.xpath("//h2[text()='Mock Given']"));
		WebElement mockPending = driver.findElement(By.xpath("//h2[text()='Mock Pending']"));
		WebElement mockSchedule = driver.findElement(By.xpath("//h2[text()='Mock Schedual']"));
		Actions act = new Actions(driver);
		
		//for drag and drop the element
		act.dragAndDrop(javaSrc,mockGiven ).perform();
		act.dragAndDrop(sqlSrc, mockGiven).perform();
		act.dragAndDrop(manualSrc, mockGiven).perform();
		act.dragAndDrop(apiSrc,mockPending).perform();
		act.dragAndDrop(seleniumSrc, mockSchedule).perform();
		
		//to make right click
		WebElement contextClick = driver.findElement(By.xpath("//a[text()='JAVA']"));
		act.contextClick(contextClick).perform();
		
		//to print all the option
		List<WebElement> options = driver.findElements(By.xpath("//button[contains(@class,'BppQGb2j7TfyB5')]"));
		for(int i= 0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
	    
	   
	}

}
