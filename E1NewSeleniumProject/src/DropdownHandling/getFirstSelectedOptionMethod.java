package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedOptionMethod {

	public static void main(String[] args) {
		WebDriver	driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    
	    driver.get("file:///C:/Users/Dell/Desktop/WebElement/SigleSelectDropdown.html");
	    
	    
		   WebElement multiselectdropDown = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselectdropDown);
       for (int i=2; i<=4 ; i++) {
    	   sel.selectByIndex(i);
    	   
       }
       
       WebElement firstOption = sel.getFirstSelectedOption();
       System.out.println(firstOption.getText());
	}

}
