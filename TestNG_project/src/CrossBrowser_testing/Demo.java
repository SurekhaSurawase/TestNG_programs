package CrossBrowser_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASUS\\Desktop\\Installer\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
}
	}
//	@Test
//	public void SetUp() {
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASUS\\Desktop\\Installer\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//}
