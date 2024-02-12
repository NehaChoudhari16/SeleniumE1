package methodsOfWebDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class methodsofFindElement{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		WebElement activeEle = driver.switchTo().activeElement();
		activeEle.sendKeys("bikes");
		Thread.sleep(1000);
		List<WebElement> bikeOptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		for (WebElement we : bikeOptions) {
			String options = we.getText();
			System.out.println(options);
			Thread.sleep(1000);

		}
	}

}