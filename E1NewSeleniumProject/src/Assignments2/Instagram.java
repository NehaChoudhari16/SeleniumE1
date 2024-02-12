package Assignments2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(5000);
				
		WebElement email = driver.findElement(By.xpath("//input[@aria-label=\"Phone number, username or email address\"]"));
	 email.sendKeys("qspiders@gmail.com");
	 Thread.sleep(2000);
	 
	 WebElement password = driver.findElement(By.xpath("//input[@aria-label=\"Password\"]"));
	 password.sendKeys("password@789");
	 Thread.sleep(2000);
	 
	 WebElement loginButton = driver.findElement(By.xpath("//div[@class=\"x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1\"]"));
	 loginButton.click();
	}

}
