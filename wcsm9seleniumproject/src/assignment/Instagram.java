package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	 driver.get("https://www.google.com");
	 Thread.sleep(2000);
	
	driver.switchTo().activeElement().sendKeys("Instagram",Keys.ENTER);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//cite[@class='tjvcx GvPZzd cHaqb' and (text()='https://www.instagram.com')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Nishant"); //for enter username
	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("Pass123"); //for enter username
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'L')]")).click(); //for click on login7
}
}
