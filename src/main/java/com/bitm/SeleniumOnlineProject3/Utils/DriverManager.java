package com.bitm.SeleniumOnlineProject3.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	static {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karmo\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	}
	public static WebDriver driver = new ChromeDriver();

	DriverManager() {
		
	}

}