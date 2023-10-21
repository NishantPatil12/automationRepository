package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage2 {  //Naukri.com

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("login_Layer")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input")).sendKeys("mrnishantpatil121@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[3]/input")).sendKeys("12345678");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[6]/button")).click();
		Thread.sleep(5000);
		driver.close();
	
	}
}
