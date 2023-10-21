package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/hp/Desktop/HTML/Registration%20From.html");
	Thread.sleep(3000);
	driver.findElement(By.name("name")).sendKeys("Nishant");
	Thread.sleep(2000);
	driver.findElement(By.name("surname")).sendKeys("Patil");
	Thread.sleep(2000);
	driver.findElement(By.name("Emailid")).sendKeys("nishant@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("id1")).sendKeys("Password123");
	Thread.sleep(2000);
	driver.findElement(By.id("id2")).sendKeys("Password123");
	Thread.sleep(2000);
	driver.findElement(By.id("a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/center/table/tbody/tr[7]/td[2]/select")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/center/table/tbody/tr[7]/td[2]/select/option[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("number")).sendKeys("12345678");
	Thread.sleep(2000);
	driver.findElement(By.id("button")).click();
	Thread.sleep(2000);
	//Login Page
	driver.findElement(By.name("username")).sendKeys("nishant@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("afsfwd")).sendKeys("Password123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"kjfyjd\"]")).click();
	Thread.sleep(2000);
	
		
}
}
