package TestNG_features;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority_keyword {

	WebDriver driver;
	@BeforeMethod
	public void SetUP() {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority =2)
	public void Logo() {
		boolean logo = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println(logo);
	}
	
	@Test(priority = 1)
	public void Title() {
		String title =driver.getTitle();
		System.out.println(title);
	}
	
	@AfterMethod
	public void Logout() {
		driver.quit();
	}
	
	@Test
	public void method1() {
		System.out.println("method1");
	}
	
	@AfterSuite
	public void demo1() {
		System.out.println("Demo1");
	}
}
