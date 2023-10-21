package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=indiabix&rlz=1C1CHBF_enIN988IN988&oq=&aqs=chrome.0.35i39i362l8.9274j0j15&sourceid=chrome&ie=UTF-8s");
		
			Thread.sleep(3000);
	driver.findElement(By.partialLinkText("IndiaBIX: Aptitude Questions and Answers")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.partialLinkText("Java Programming")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.partialLinkText("Exceptions")).click();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(3000);

	driver.quit();
	
	}

}
