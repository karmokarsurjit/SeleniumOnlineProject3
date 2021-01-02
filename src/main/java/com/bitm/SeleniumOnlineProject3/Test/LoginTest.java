package com.bitm.SeleniumOnlineProject3.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.SeleniumOnlineProject3.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject3.Utils.UrlTxtUtils.URL;
import com.bitm.SeleniumOnlineProject3.Utils.UrlTxtUtils.Text;
import com.bitm.SeleniumOnlineProject3.Utils.XpathUtils.LogInModule;

public class LoginTest {

	private WebDriver driver = null;

	@Test
	public void homepagetitleverify() 
	{
		driver = DriverManager.driver;
		driver.get(URL.baseUrl);
		Assert.assertEquals(driver.getTitle(), Text.homepageTilte);
		System.out.println("Homepage Title Verified");
	}
	
	@Test(dependsOnMethods = "homepagetitleverify")
	public void logintest() {
		driver.findElement(By.xpath(LogInModule.username)).sendKeys("Admin");
		driver.findElement(By.xpath(LogInModule.password)).sendKeys("admin123");
		driver.findElement(By.id(LogInModule.LoginBtn)).click();
		System.out.println("Logged in Successfully");
		
	}

}