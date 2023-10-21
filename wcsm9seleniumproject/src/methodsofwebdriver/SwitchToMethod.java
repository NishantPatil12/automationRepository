package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	Thread.sleep(3000);
	
	driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
	Thread.sleep(2000);
	
	driver.findElement(By.partialLinkText("Selenium")).click();
	Thread.sleep(2000);
	
	
}
}
 