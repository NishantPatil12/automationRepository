package assignmentproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rightclick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		//Implicit Wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 driver.get("http://demoapps.qspiders.com/dropdown");
			//identify dropdown options and click
			 driver.findElement(By.xpath("//section[text()='Button']")).click();
			 driver.findElement(By.partialLinkText("Right Click")).click();
			 
			 Actions act=new Actions(driver);
			 
			 WebElement rightclick1= driver.findElement(By.xpath("//button[text()='Right Click'])[1]"));
			 WebElement rightclick2= driver.findElement(By.xpath("//button[text()='Right Click'])[2]"));
			 WebElement rightclick3= driver.findElement(By.xpath("//button[text()='Right Click'])[3]"));
			 
			 //driver.findElement(By.xpath("//div[text()='Yes']")).click();
			 

	}

}
