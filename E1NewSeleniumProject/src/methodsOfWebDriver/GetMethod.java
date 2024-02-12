package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); //To launch ChromeDriver
		Thread.sleep(1000);
		driver.get("https://www.flipkart.com/");	

	}

}
