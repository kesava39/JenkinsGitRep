package Ant_Jenkins_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ant_Jenkins_Test {
	
	@Test
	public void loginTest() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.rediff.com");
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		Thread.sleep(5000);
		
		driver.quit();
		
	}
}
