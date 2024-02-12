package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandSelectionMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    
	    driver.get("file:///C:/Users/Dell/Desktop/WebElement/SigleSelectDropdown.html");
	    
	    
	    WebElement singleselectDropdown = driver.findElement(By.id("menu"));
	     
	   Select sel = new Select(singleselectDropdown);
	      
		//to select an option by using the index value
	    sel.selectByIndex(4);
	    Thread.sleep(5000);
	      
	    //to select an option by using the value of option 
	    sel.selectByValue("v7");
	    Thread.sleep(5000);
	     
	    // to select an option by using the value of option
	    sel.selectByVisibleText("samosa");
	    Thread.sleep(5000);
	    
	}

}
