package DropdownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hashset {

	private static final String TextToInsert = null;

	public static void main(String[] args) {
		WebDriver	driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    
	    driver.get("file:///C:/Users/Dell/Desktop/WebElement/Multiselectdropdown.html");
	    		
	   WebElement multiselectdropDown = driver.findElement(By.id("menu"));
	     
	   Select sel = new Select(multiselectdropDown); //to creat the object of select
	   
	   //to remove the duplicates using Hash set and store the elements in ascending order 
	 HashSet<String> Hs = new HashSet<String>();  // to creat the list of all the options 
	    
	   List<WebElement> options = sel.getOptions();

	   
	   for(int i=0; i<options.size(); i++) {
		   options.get(i).getText();
		   
		
		
	   }
//	   for(WebElement we  : options) {
//		 String TextToInsert = we.getText();
//		 Hs.add(TextToInsert);
//        System.out.println(TextToInsert);
//	   }
//     
    	 
	
	
	}



	}


