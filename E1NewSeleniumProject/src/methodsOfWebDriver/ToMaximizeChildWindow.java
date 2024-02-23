package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximizeChildWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // To launch chrome browser.
		driver.manage().window().maximize();// to maximize the screen
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");


		driver.findElement(By.partialLinkText("Open a popup window")).click();// to open a new window

		Set<String> allwindows = driver.getWindowHandles();//to get the address of all the windows 
        
		
		//to iterate and switch the control to the windows one by one 
		for (String wh : allwindows) {
			String title = driver.switchTo().window(wh).getTitle();//to get title of each window 

			if (title.equals("New Window")) //to comapre the title with the title of child window 
			{
				driver.manage().window().maximize();//to maximize the child window 

			}

		}

	}

}
