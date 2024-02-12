package Assignments2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qtalk {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();// To Launch Browser
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://chat.qspiders.com/");
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder=\"Enter Number / Email\"]"));
		 username.sendKeys("1234567892");
		 Thread.sleep(2000);
		 
		 WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		 password.sendKeys("12345213");
		 Thread.sleep(2000);
		
		WebElement loginButton=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		loginButton.click();
	}

}
