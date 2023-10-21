package methodsofwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
      //handle properties of browser such as
      //1]maximize 2]Minimize 3]FullScreen 4]Set Size 5]Set Positon
		
//		driver.manage().window().maximize(); //Maximize browser
//		Thread.sleep(3000);
//		
//		driver.manage().window().minimize(); //Minimize browser
//	    Thread.sleep(3000);
//	    
//		driver.manage().window().fullscreen(); //Fullscreen browser
//		Thread.sleep(3000);
		
		Dimension targetSize=new Dimension(350,450);
		driver.manage().window().setSize(targetSize);//Set the size of browser
		Thread.sleep(3000);
		driver.close();
		
		Point targetPosition = new Point(450,350);
		driver.manage().window().setPosition(targetPosition);//set position of browser
}
}
