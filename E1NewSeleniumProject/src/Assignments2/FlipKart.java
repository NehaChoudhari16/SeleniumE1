package Assignments2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);  
			
		WebElement login=driver.findElement(By.xpath("//div[@class=\"H6-NpN _3N4_BX\"]"));
		login.click();
		WebElement email = driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]"));
	 email.sendKeys("qspiders@gmail.com");
	 Thread.sleep(2000);
	 
		 
	 WebElement sendOTP = driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]"));
	 sendOTP.click();
	 Thread.sleep(2000);
	 WebElement Mobaile = driver.findElement(By.xpath("//input[@maxlength=\"10\"]"));
	 Mobaile.sendKeys("1234567890");
	 Mobaile.click();
	 Thread.sleep(2000);
	
	 WebElement Button = driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]"));
	 Button.click();
	 
	 
	 
	}

}
