package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp { //Runtime Polymorphism 

	//static Webdriver
	public static void main(String[] args) throws InterruptedException {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Browser Value!!");
        String browserValue = sc.next();
        
        
        if(browserValue.equalsIgnoreCase("chrome"))
        {
        	WebDriver driver=new ChromeDriver();
    		driver.get("https://www.flipkart.com//");
        	driver.manage().window().maximize();
        	Thread.sleep(2000);
        	driver.close();
        }
        else if(browserValue.equalsIgnoreCase("Firefox"))
        {
        	WebDriver driver=new FirefoxDriver();
    		driver.get("https://www.flipkart.com//");
        	driver.manage().window().maximize();
        	Thread.sleep(2000);
        	driver.close();
	    }
        else if(browserValue.equalsIgnoreCase("Edge"))
        {
        	WebDriver driver=new EdgeDriver();
    		driver.get("https://www.flipkart.com//");
        	driver.manage().window().maximize();
        	Thread.sleep(2000);
        	driver.close();
        }
        else
        {
        	System.out.println("Browser launched");
        }
	}
}
        
        
        
        