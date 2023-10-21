package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLaunch {

	 public static void main(String[] args) throws InterruptedException {




			WebDriver d= new ChromeDriver();
			d.get("https://www.flipkart.com//");
			d.manage().window().maximize();
			Thread.sleep(3000);
			
			d.findElement(By.xpath ("//input[@class='_3704LK']")).sendKeys("Mobiles");
			Thread.sleep(3000);
			
			d.findElement(By.xpath ("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(3000);
			
			

}
	 }
