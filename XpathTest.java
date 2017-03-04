package com.Selenium.qaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTest {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Follow\\Desktop\\Seleniumtools\\geckodriver.exe");
		
		System.out.println("Got driver location");
		driver = new FirefoxDriver();
		System.out.println("Got browser");
		driver.get("http://107.170.213.234/catalog/index.php");
		
		System.out.println("Title is " + driver.getTitle() );
		
		
		driver.findElement(By.xpath(".//*[@id='bodyContent']/div/div[2]/table/tbody/tr[1]/td[1]/a[1]/img")).click();
		driver.wait(10);
		
		
		driver.close();
		driver.quit();
		
		
	}

}
