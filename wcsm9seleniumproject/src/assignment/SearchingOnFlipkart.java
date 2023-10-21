package assignment;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;


public class SearchingOnFlipkart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//Open the google 
		 driver.get("https://www.google.com");
		
		//search Flipkart on google searching tab
		driver.switchTo().activeElement().sendKeys("Flipkart",Keys.ENTER);
		
		//for click on search button and send the values
		driver.findElement(By.xpath("//h3[contains(@class,'LC20lb MBeuO DKV0Md')and (text()='Flipkart')]")).click();
		Thread.sleep(1000);
		
		//Displayed pop-up that pop-up Click on close button 
		driver.findElement(By.xpath("//span[contains(@class,'_30XB9F')and (text()='✕')]")).click();
		Thread.sleep(1000);
		
		//Search mobile on searching tab
		driver.findElement(By.name("q")).sendKeys("Mobiles",Keys.ENTER);
		
		// get the handle for parent window 
		String parentHandle = driver.getWindowHandle();
		
		//Click on mobile --> MOTOROLA G32
		driver.findElement(By.xpath("//div[contains(@class,'_4rR01T')and (text()='MOTOROLA G32 (Mineral Gray, 128 GB)')]")).click();
		Thread.sleep(4000);
				
		//get the address of all window
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
			}
		}
		
		//click on GO TO CART button		
	    driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2U9uOA _')]")).click();
	    Thread.sleep(1000);
	    
	    
		//click on cart button
		driver.findElement(By.xpath("//a[contains(@class,'_3SkBxJ')]")).click();
	    Thread.sleep(1000);
		
		 
		//click on remove button
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/div/div[3]/div/div[3]/div[2]/div[2]")).click();
		Thread.sleep(4000);		
		
	}
}

