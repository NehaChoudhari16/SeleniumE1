package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); //To launch chrome driver 
	    driver.manage().window().maximize(); // to maximize the browser 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));  //
	    driver.get("http://127.0.0.1/login.do");
	    
	   WebElement loginButton = driver.findElement(By.id("loginButton")); //to find the login button 
	
	    Point point = loginButton.getLocation(); // to get location of login button
	   int xaxis = point.getX();  // to get the x axis point of login  button 
	    int yaxis = point.getY(); // to get the y axis point of login  button
	   System.out.println("xaxis is: "+xaxis+" "+"yaxis is : "+ yaxis); // to print the value of x and y in the console
	   
	}

}
