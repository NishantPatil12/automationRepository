package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethods {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("www.google.com");
		 Thread.sleep(2000);
		 
		 System.out.println(driver.getTitle());
		 driver.close();
	

}
}
