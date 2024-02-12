package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); //To launch ChromeDriver
		driver.manage().window().maximize(); // To maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Implicit wait 
		driver.get("https://instagram.com/");

	driver.findElement(By.name("username")).sendKeys("Neha");
	}

}
