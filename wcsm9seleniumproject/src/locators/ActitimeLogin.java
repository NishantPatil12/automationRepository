package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {
			public static void main(String[] args) throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			//Open the browser and pass the url and open the page
			driver.get("http://desktop-u6mlrj4/login.do");
			Thread.sleep(2000);
			//Identify user name text box
			driver.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(2000);
			//Identify Password text box
			driver.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			//Create a customer
			driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/img")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/div/table/tbody/tr/td[6]/nobr/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"customersProjectsForm\"]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/input[1]")).click();
			Thread.sleep(2000);
			
			
			
		}

	

}
