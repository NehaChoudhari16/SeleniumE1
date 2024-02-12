package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    driver.get("http://127.0.0.1/login.do");
	    
	   WebElement loginButton = driver.findElement(By.id("loginButton")); //to find the login button 
	
	   
	  String loginText = loginButton.getText(); //To get the text of login button
	   System.out.println(loginText); //to print the text of login button in the console
	   
	 WebElement link = driver.findElement(By.id("lisencelink")); // to find the link 
	 String linkText = link.getText(); // to get the text of the link 
	 System.out.println(linkText); // to print of text of the link
	
	}

}
