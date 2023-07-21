package CrossBrowser_testing;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser {

	//String Browsername, String username, String PWD
	WebDriver driver;
	@Parameters({"Browsername"})
	@Test
	public void Orange_HRM( String Browsername) {
		
		if(Browsername.equalsIgnoreCase("Firefox")) {
		System.setProperty("Webdriver.gecko.driver", "D:\\Installer\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		}
		
		else if(Browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer\\chromedriver.exe");
			driver = new ChromeDriver();
		}
//
//		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer\\chromedriver.exe");
//		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement uname= driver.findElement(By.xpath("//input[@name=\"username\"]"));
		uname.sendKeys("Admin");
		WebElement passwords= driver.findElement(By.xpath("//input[@name=\"password\"]"));
		passwords.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	
	}

}