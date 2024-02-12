package DropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandoprationalmethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    
	    driver.get("file:///C:/Users/Dell/Desktop/WebElement/Multiselectdropdown.html");
	    		
	   WebElement multiselectdropDown = driver.findElement(By.id("menu"));
	     
	Select sel = new Select(multiselectdropDown);
	 boolean result = sel.isMultiple();
	   System.out.println(result);
	   System.out.println();
	   
	   //to get all the options from a dropdown 
	 List<WebElement> Options = sel.getOptions();
	   for(int i=0; i< Options.size(); i++)
	   {
		   String op = Options.get(i).getText();
		   System.out.println(op);
	   }
	   
	   for(WebElement we: Options )
	   {
		  String op = we.getText();
		  System.out.println(op);
		  
	   }
	   
	  
	}

}
