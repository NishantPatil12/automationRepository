package assignmentproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {
//Move to element method
	//It is use to performmouseover actions
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.bluestone.com/");
		
		 //Handle the popup
		 Thread.sleep(2000);
		 driver.findElement(By.id("dnyBtn"));
		 
		 //Perform the mouseover on watch jewellary
		WebElement target= driver.findElement(By.id("//a[text()='Watch Jewellery']"));
		Actions act = new Actions(driver);
		act.MoveToElement(target).perform();
		

	}

}
