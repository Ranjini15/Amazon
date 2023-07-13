package com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon_base {

	public static WebDriver driver;

	public static Actions act;
	
	public static Robot r;
	
	public static Select s;

	public static void getDriver() {

		System.setProperty("webdriver.chrome.driver", "D:\\Ranjini\\Amazon\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void geturl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().refresh();

	}

	public static void moveToElement(WebElement id) {
		act = new Actions(driver);
        act.moveToElement(id).perform();

	}
	
	public static void click(WebElement element) {
		
		element.click();

	}

	public static void contextClick(WebElement id) {
		act = new Actions(driver);
        act.contextClick(id).perform();

	}
	
	public static void vk_Down() throws AWTException {
		 r =new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	
	public static void vk_Enter() throws AWTException {
		 r =new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void window_Handling() {
		Set<String> handles = driver.getWindowHandles();
		for(String s:handles) {
			String title = driver.switchTo().window(s).getTitle();
			System.out.println(title);
		}

	}
	
	public static void navigate(String url) {
		
		driver.navigate().to(url);
		driver.manage().window().maximize();

	}
	
	public static void dropdown(WebElement d,String select,String text) {
           
            s=new Select(d);
            if(select.equalsIgnoreCase("selectByVisibleText")) {
            	s.selectByVisibleText(text);
            	
            }
           
           
	}
	
	public static void alert(String acc) {
		
		driver.switchTo().alert();
		if(acc.equalsIgnoreCase("accept")) {
			
			driver.switchTo().alert().accept();
			
		}

	}

}
