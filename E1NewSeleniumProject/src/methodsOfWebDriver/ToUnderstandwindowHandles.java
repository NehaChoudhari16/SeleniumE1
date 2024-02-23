package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandwindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();   //To launch chrome browser.
        driver.manage().window().maximize();//to maximize the screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://omayo.blogspot.com/");
        
       String parentwindow = driver.getWindowHandle();//to get the address of parent window 
       System.out.println(parentwindow); //to print the parent window address in the console 
       String parentTitle = driver.getTitle();//to get the title of parent window 
       
        driver.findElement(By.partialLinkText("Open a popup window")).click();//to open a new window 
        Set<String> allWindow = driver.getWindowHandles();//to get the address og all the window 
        
        //to iterate and switch the control to the window one by one 
      //  for(String wh : allWindow)
        //{
        	//driver.switchTo().window(wh);
        	
        	//if(!driver.getTitle().equals("omayo (QAFox.com)"));
        	//{
        	//	driver.close();
        //	}
        //}
        
        for(String wh : allWindow)
        {
        	String title = driver.switchTo().window(wh).getTitle();//to get title of each window 
        
        if(!title.equals(parentTitle)) // to compare title with parent window title 
        {
        	driver.close(); //to close the child window 
        }
        
        }
        	
	}

}
