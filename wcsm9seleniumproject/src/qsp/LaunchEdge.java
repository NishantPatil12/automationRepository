package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {
 
	public static void main(String []args ) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		  driver.manage().window().maximize();
	      Thread.sleep(6000);
	      
	      driver.manage().window().minimize();
	      Thread.sleep(6000);
	    
		System.out.println("Edge is open");
		
		Thread.sleep(2000);
		driver.close();
	}
}
