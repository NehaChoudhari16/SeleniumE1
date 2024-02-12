package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsizeMethod {

	public static void main(String[] args)  {
		WebDriver	driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    
	    driver.get("http://127.0.0.1/login.do");
	    
	    
	    //To find username text box and store in a variable 
	   WebElement usnTB = driver.findElement(By.name("username"));
       Dimension size = usnTB.getSize();
       
       int Height = size.getHeight();
      int width = size.getWidth();
      
      System.out.println("hight is: "+ Height +" "+ "width is :"+ width);
	}

}
