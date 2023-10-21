package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLogin {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("id_userLoginId")).sendKeys("nishantpatil@gmail.com");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("id_password")).sendKeys("Pata nahi");
		 Thread.sleep(2000);
	

	}

}
