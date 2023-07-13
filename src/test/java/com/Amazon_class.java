package com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon_class extends Amazon_base {

	public static void main(String[] args) throws AWTException {
		getDriver();
		geturl("https://www.amazon.in/");

		WebElement mob = driver.findElement(By.xpath("//a[text( )='Mobiles']"));

		moveToElement(mob);
		contextClick(mob);
		vk_Down();
		vk_Enter();
		window_Handling();
		navigate("https://demoqa.com/select-menu");
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		WebElement dropdown=driver.findElement(By.id("oldSelectMenu"));
		
        dropdown(dropdown,"selectByVisibleText","Yellow");
        
        navigate("https://demoqa.com/alerts");
        
        
        WebElement button = driver.findElement(By.id("confirmButton"));
        click(button);
        
        alert("accept");
        
	}

	
		

}
