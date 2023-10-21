package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("student");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
