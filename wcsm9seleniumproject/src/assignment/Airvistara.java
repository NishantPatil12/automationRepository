package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Airvistara {

	public static void main(String[] args) {
		
//		WebDriver driver =new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//		driver.get("https://www.airvistara.com/in/en");
//		driver.findElement(By.xpath("//button[contains(@id,'cookieModalCloseBtn') ]")).click();
//		//driver.switchTo().activeElement().sendKeys("")


		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "/home/users/garima.pathak/Desktop/softwares/chromedriver");
		WebDriver driver =new ChromeDriver(options);
		driver.get("http://wordpressdemo.webkul.com/wordpress-latest-tweets/");
		driver.manage().window().maximize();
		}
		

	

}
