package com.Selenium.qaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class LinkTextTest {
		public static WebDriver driver;
		
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Follow\\Desktop\\Seleniumtools\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		System.out.println("Got browser");
		driver.get("http://107.170.213.234/catalog/index.php");
		
		System.out.println("Title is " + driver.getTitle() );
		
		
		driver.findElement(By.linkText("log yourself in")).click();
		driver.wait(3000);
		
				//("html/body/div[1]/div/div/div/header/div/div[2]/div/div/div/div/div/div[1]/nav/button[1]")).click();
		//driver.findElements(By.xpath(xpathExpression))
		
		System.out.println("Executed ");
		
		driver.close();
		driver.quit();
		

	}

}
