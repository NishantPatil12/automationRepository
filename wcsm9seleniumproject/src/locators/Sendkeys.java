package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//Open the browser and pass the url and open the page
		driver.get("file:///C:/Users/hp/Desktop/selenium%20data/textbox.html");
		Thread.sleep(2000);
		
		//Identify username textbox
		driver.findElement(By.tagName("input")).sendKeys("admin");
		Thread.sleep(2000);
		
		//Identify Password textbox
		driver.findElement(By.id("id2")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("button")).click();
		
		driver.close();
	}

}
