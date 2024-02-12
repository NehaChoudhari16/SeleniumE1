package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {

		
		
		WebDriver driver = new ChromeDriver(); //To launch the browser
		Thread.sleep(1000);
		driver.navigate().to("https://www.amazon.com/");  //To launch web application
		driver.navigate().back();  //To navigate backward
		Thread.sleep(1000);
		driver.navigate().forward();  // To navigate forward
		Thread.sleep(1000);
		driver.navigate().refresh();  //To navigate refresh
		Thread.sleep(1000);
		driver.close();
			
	}

}
