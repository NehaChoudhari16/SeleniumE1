package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();   //To launch chrome browser.
        Thread.sleep(5000);   //To Stop The execution For 5 Sec.
        driver.close();       // To close The Browser window.
	}

}
