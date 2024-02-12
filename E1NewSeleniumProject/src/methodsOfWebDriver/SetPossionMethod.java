package methodsOfWebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SetPossionMethod{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();// to launch chrome browser
		Thread.sleep(100);
		driver.manage().window().maximize();// maximize the browser window
		Thread.sleep(1000);
		Point point = new Point(400, 200);
		driver.manage().window().setPosition(point);
	}
}