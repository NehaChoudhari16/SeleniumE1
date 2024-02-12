package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSignup {

	public static void main(String[] args) {
		WebDriver	driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	    
	    driver.get("https://www.facebook.com/campaign/landing.php");
	    	WebElement DayDropDown = driver.findElement(By.id("day"));
	    WebElement MonthDropDown = driver.findElement(By.id("month"));
	  WebElement YearDD = driver.findElement(By.id("year"));
	  
	   Select daySelect = new Select(DayDropDown);
	 boolean result = daySelect.isMultiple();
	  System.out.println("DayDropDown is multiple?   :"+result);
	  List<WebElement> dayoptions = daySelect.getOptions();
	  
	  for(WebElement we : dayoptions ) {
		  System.out.println(we.getText());
		  
	  }
	  
	  daySelect.selectByIndex(16);
	  System.out.print("------------------------------------------------------");
	  System.out.println();
	  
	  
	  
	  
	 Select MS = new Select(MonthDropDown);
	  boolean result2 = MS.isMultiple();
	  System.out.println();
	  
	  
	List<WebElement> MonthOptions = MS.getOptions();
	for(WebElement we :MonthOptions ) {
		System.out.println(we.getText());
	}
	MS.selectByValue("11");
	System.out.print("----------------------------------------------------------"); 
	System.out.println();
	
	
	
	  
	Select YearSelect = new Select(YearDD);
	 boolean result3 = YearSelect.isMultiple();
	  System.out.println("YearDDS is multiple?   :"+result);
	List<WebElement> YearOptions = YearSelect.getOptions();
	  
	  for(WebElement we : YearOptions ) {
		  System.out.println(we.getText());
		  
	  }
	  
	  YearSelect.selectByIndex(16);
	  System.out.print("------------------------------------------------------");
	  System.out.println();
	  
	  
	
	
	  
	  
	  
	}

}
