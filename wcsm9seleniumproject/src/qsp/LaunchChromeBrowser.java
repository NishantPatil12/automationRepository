package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	
	public static void main(String[] args) throws InterruptedException {

	WebDriver driver =new ChromeDriver();//to launch the chrome browser create the object of chromeDriver
	
	    driver.get("https://www.flipkart.com/");//Launch the webapp flipkart on chrome
	    
	     
	    driver.manage().window().maximize();//Maximize the Chromebrowser
        Thread.sleep(4000);//Stop the execution of script for 4sec
	    
        System.out.println(driver.getTitle());
        
        
        driver.manage().window().minimize();//Minimize the Chromebrowser
	    Thread.sleep(4000);//Stop the execution of script for 4sec
	      
	    System.out.println("Chrome Browser Launched");
	    System.out.println("Flipkart Page should be opened");
	    //driver.findElement(By.partialLinkText(null)).click();
	    
		
	    Thread.sleep(4000);//Stop the execution of script for 4sec
		
	    driver.close();//how to quickly close the Chrome browser
  }
}
