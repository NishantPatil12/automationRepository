package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendandClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.google.com");
		 Thread.sleep(2000);
		 driver.switchTo().activeElement().sendKeys("Joey Tribbiani",Keys.ENTER);
		 Thread.sleep(4000);
		 
		 driver.findElement(By.className("lNPNe")).click();
		 Thread.sleep(4000);
		 
		 driver.get("https://www.google.com");
		 Thread.sleep(2000);
		 driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
		 Thread.sleep(4000);
		 
		 driver.findElement(By.className("lNPNe")).click();
		 driver.close();
		 

	}

}
