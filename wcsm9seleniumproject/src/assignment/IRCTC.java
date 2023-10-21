package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTC {
	public static void main(String[] args) throws InterruptedException {
		
	   ChromeOptions co= new ChromeOptions();
	   co.addArguments("--disable-notifications");
	   
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//Open the browser and pass the url and open the page
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
}
}
