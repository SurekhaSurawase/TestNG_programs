package TestNG_features;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority2 {

	WebDriver driver;
	@BeforeMethod
	public void SetUP() {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void test1() {
		System.out.println("This is test1 method");
	}
	
	@Test(priority=0)//3
	public void test2() {
		System.out.println("This is test2 method");
	}
	@Test(priority=1)//4
	public void test3() {
		System.out.println("This is test3 method");
	}
	@Test(priority=-1) //2
	public void test4() {
		System.out.println("This is test4 method");
	}
	@Test(priority=-3) //1
	public void test5() {
		System.out.println("This is test5 method");
	}
	@Test(priority=2)//5
	public void test6() {
		System.out.println("This is test6 method");
	}
	
	@AfterMethod
	public void logout() {
		driver.quit();
	}
}
