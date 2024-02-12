package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSourcePage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); //To launch ChromeDriver
      Thread.sleep(1000);
	driver.get("https://www.facebook.com/");
    Thread.sleep(1000);
    String pageSource = driver.getPageSource();
    System.out.println(pageSource);

	
	
	
	}

}
