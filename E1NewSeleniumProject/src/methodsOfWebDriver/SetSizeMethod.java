package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver(); //To launch the browser
       Thread.sleep(1000);
       driver.manage().window().maximize();  //Maximize the browser windows
       Thread.sleep(1000);

       
    Dimension targetSize= new Dimension(500, 400);  //to pass width and height to Dimensions class.
       driver.manage().window().setSize(targetSize);  // To pass the dimensions to setSize Method
	}

}
