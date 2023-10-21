package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		 driver.get("https://www.google.com");
		
		
		driver.switchTo().activeElement().sendKeys("Amazon",Keys.ENTER);
	
		
		//for click on search button and send the values
		driver.findElement(By.xpath("//span[contains(@class,'x2VHCd OSrXXb ob9lvb')and (text()='https://www.amazon.in')]")).click();
		
		
		driver.findElement(By.xpath("//input[contains(@class,'nav-input nav-progressive-attribute')]")).sendKeys("Laptop");
		
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		 js.executeScript("window.scrollBy(0,1500)");
		 Thread.sleep(1000);
		
		 
		 driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div")).click();
		
			

			 
		
		

	}

}
