package com.bitm.SeleniumOnlineProject3.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bitm.SeleniumOnlineProject3.Utils.TestNGReporting;
import com.bitm.SeleniumOnlineProject3.DTO.LoginDTO;
import com.bitm.SeleniumOnlineProject3.DataProvider.LoginDataProvider;
import com.bitm.SeleniumOnlineProject3.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject3.Utils.UrlTxtUtils.URL;
import com.bitm.SeleniumOnlineProject3.Utils.UrlTxtUtils.Text;
import com.bitm.SeleniumOnlineProject3.Utils.XpathUtils.LogInModule;

@Listeners(TestNGReporting.class)
public class LoginTest {

	private WebDriver driver = null;

	@Test
	public void homepagetitleverify() {
		driver = DriverManager.driver;
		driver.get(URL.baseUrl);
		Assert.assertEquals(driver.getTitle(), Text.homepageTilte);
		System.out.println("Homepage Title Verified");
	}

	@Test(dependsOnMethods = "homepagetitleverify", dataProvider = "loginData", dataProviderClass = LoginDataProvider.class)
	public void logintest(List<LoginDTO> logdata) {
		for (LoginDTO login : logdata) {
			driver.findElement(By.xpath(LogInModule.username)).sendKeys(login.getUsername());
			driver.findElement(By.xpath(LogInModule.password)).sendKeys(login.getPassword());
			driver.findElement(By.id(LogInModule.LoginBtn)).click();
		}

		System.out.println("Logged in Successfully");
	}
}