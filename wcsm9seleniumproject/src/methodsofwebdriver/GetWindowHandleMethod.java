package methodsofwebdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://omayo.blogspot.com/");
	 Thread.sleep(2000);
	 //Take the address of current window or browser
	 //parent browser...{the browser or window has controls}
	 
	 String parentHandle = driver.getWindowHandle();
	 System.out.println("address of parent browser or window"+parentHandle);
	 Thread.sleep(2000);
	 
	 //click on open a pop window 
	 driver.findElement(By.partialLinkText("Open a popup window")).click();
	 Thread.sleep(2000);
	 

	 //get the address of parent browser as well as child browser
	 Set<String> allHandles =driver.getWindowHandles();
	 //print the address of browser use for each loop
	 System.out.println(allHandles);
	 
	 	for(String wh:allHandles)
	 {
		 //System.out.println("Parent Handle :"+wh+"child Handle :"+wh);
		 if(!parentHandle.equals(wh))
		 {
			 System.out.println("Address of child Window :"+wh);
			 Thread.sleep(2000);

			 
			driver.switchTo().window(wh).close();//for immidiately close the child browser
		}
	 else
	 {
		 System.out.println("parent Handle :"+wh);
			  
	 }	 
		 driver.quit();
}
}
}

