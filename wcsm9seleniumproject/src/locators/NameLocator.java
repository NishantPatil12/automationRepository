package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/hp/Desktop/selenium%20data/radiobutton.html");
		
		//identify d radio button by using name locator
		driver.findElement(By.name("n1")).click();
		Thread.sleep(2000);
		
		
		
	}

}
