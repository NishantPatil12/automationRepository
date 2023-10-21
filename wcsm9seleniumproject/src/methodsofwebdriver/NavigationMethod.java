package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launch th webapplicatin by using navigate();
		Navigation nav =driver.navigate();
		nav.to("https://www.flipkart.com//");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("✕")).click();
		
		nav.back();  //To perform Backword Operation
		Thread.sleep(2000);
		
		nav.forward();  //To perform Forword Operation
		Thread.sleep(2000);
		
		nav.refresh(); // //To perform Refresh Operation
		
		
		
		
				
	}

}
