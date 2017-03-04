package com.Selenium.qaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PLinkText_Test {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Follow\\Desktop\\Seleniumtools\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		System.out.println("Got browser");
		driver.get("http://107.170.213.234/catalog/index.php");
		
		System.out.println("Title is " + driver.getTitle() );
		
		
		driver.findElement(By.partialLinkText("log yourself")).click();
		driver.wait(2);
		
		
		driver.close();
		driver.quit();
		
		
		

	}

}
