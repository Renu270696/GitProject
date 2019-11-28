package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat\\eclipse-workspace\\gree1\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		ChromeOptions a = op.addArguments("disable-popup-blocking");

		WebDriver driver = new ChromeDriver(a);
		driver.get("https://www.redbus.in/");
	
	}
}
