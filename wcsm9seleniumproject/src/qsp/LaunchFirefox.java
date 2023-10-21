package qsp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchFirefox {
	
		public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new FirefoxDriver();//to launch the chrome browser create the object of chromeDriver
		
		  driver.manage().window().maximize();
	      Thread.sleep(6000);
	      
	      driver.manage().window().minimize();
	      Thread.sleep(6000);
		
		System.out.println("Firefox Browser Launched");
			
			Thread.sleep(2000);//Stop the execution of script for 2sec
			driver.close();//how to quickly close the Firefox browser
		   
			
	     
	  }
	}



