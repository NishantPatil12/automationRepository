package JavaScriptExecuter;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllInOne {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		WebElement disabledTextBox = driver.findElement(By.id("tb2"));
		
		Point loc = disabledTextBox.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
			
		
 
	}
	
}
