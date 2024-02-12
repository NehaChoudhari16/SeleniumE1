package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleMethod {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver(); //To launch the browser
	Thread.sleep(2000);
	driver.manage().window().maximize(); //To maximize the browser
	Thread.sleep(2000);
	driver.get("http://www.facebook.com/");	//To launch the web application
	Thread.sleep(2000);
	String  title  = driver.getTitle();  //To get the title of the web page
	
	System.out.println(title);
	}

}
