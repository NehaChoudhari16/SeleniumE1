package DropdownHandling;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicatesUsingTreeset {

	public static void main(String[] args) {
		WebDriver	driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    
	    driver.get("file:///C:/Users/Dell/Desktop/WebElement/Multiselectdropdown.html");
	    		
	   WebElement multiselectdropDown = driver.findElement(By.id("menu"));
	     
	   Select sel = new Select(multiselectdropDown); //to creat the object of select
	   
	   //to remove the duplicates using Tree set and store the elements in ascending order 
	   TreeSet <String> ts = new TreeSet <String>();  // to creat the list of all the options 
	    
	   List<WebElement> options = sel.getOptions();
	   
	   for(WebElement we  : options) {
		 String TextToInsert = we.getText();
		 ts.add(TextToInsert);
	   }
     for (String text : ts)	{
    	 System.out.println(text);
     }
    	 
	
	
	}

}
