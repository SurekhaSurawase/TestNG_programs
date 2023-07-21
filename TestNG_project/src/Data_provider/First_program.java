package Data_provider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class First_program {

	WebDriver driver;
	@Test(dataProvider = "LoginData")
	public void Data_provider1(String username, String password) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement uname= driver.findElement(By.xpath("//input[@name=\"username\"]"));
		uname.sendKeys(username);
		WebElement passwords= driver.findElement(By.xpath("//input[@name=\"password\"]"));
		passwords.sendKeys(password);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		String Act_title= driver.getTitle();
		System.out.println(Act_title);
		
		
	}
	
	@DataProvider(name= "LoginData")
	public Object[][] LoginData() {
		Object[][] data= new Object[5][2];
		//Correct UN and correct PWD
		
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="Admin";
		data[1][1]="admin1234";
		
		data[2][0]="Admin1";
		data[2][1]="admin123";
		
		data[3][0]="Admin1";
		data[3][1]="admin1234";
		
		data[4][0]=" ";
		data[4][1]="admin123";
		
		return data;
	}
}
