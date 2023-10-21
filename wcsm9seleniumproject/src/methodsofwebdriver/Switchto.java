package methodsofwebdriver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Switchto {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
			 WebDriver driver=new ChromeDriver();
		//Maximize the Browser
	         driver.manage().window().maximize();
	    //Open the Webpage
	         driver.get("https://omayo.blogspot.com/");
	    //Wait for 2sec
	         Thread.sleep(2000);
	    //
	         String parentHandle = driver.getWindowHandle();
	         System.out.println("address of parent browser or window"+parentHandle);
	         Thread.sleep(2000);
	         driver.findElement(By.partialLinkText("Open a popup window")).click();
	         
			Set<String> allHandle = driver.getWindowHandles();
			for (String wh : allHandle) 
			{
				if (!parentHandle.equals(wh))
				{
					System.out.println("address of child window:"+wh);
					driver.switchTo().window(wh).manage().window().maximize();
					Thread.sleep(3000);
					driver.close();
					
				}
				else
				{
					System.out.println("address of parent window:"+wh);
				}
			}
			Thread.sleep(2000);
			
	        
		}

	}

