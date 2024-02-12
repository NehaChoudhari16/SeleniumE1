package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); //To launch ChromeDriver
	      Thread.sleep(1000);
		driver.get("https://www.flipcart.com/"); //To launch the web application
	    Thread.sleep(1000);
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
}

}
