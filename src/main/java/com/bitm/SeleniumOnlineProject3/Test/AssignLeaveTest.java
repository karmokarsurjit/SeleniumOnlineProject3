package com.bitm.SeleniumOnlineProject3.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.bitm.SeleniumOnlineProject3.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject3.Utils.XpathUtils.AssignLeaveModule;

public class AssignLeaveTest {
	
	private WebDriver driver = null;
	
	@Test
	public void assignLeaveTest()
	{
		driver = DriverManager.driver;
		driver.findElement(By.xpath(AssignLeaveModule.assignBtn)).click();
		
		driver.findElement(By.id(AssignLeaveModule.empname)).sendKeys("Odis Adalwin");
		
		Select leaveType = new Select(driver.findElement(By.xpath(AssignLeaveModule.leavetype)));
		leaveType.selectByVisibleText("US - Personal");
		
		driver.findElement(By.id(AssignLeaveModule.fromdatebox)).click();
		Select fromMonth = new Select(driver.findElement(By.xpath(AssignLeaveModule.frommonth)));
		fromMonth.selectByVisibleText("Jan");
		Select fromYear = new Select(driver.findElement(By.xpath(AssignLeaveModule.fromyear)));
		fromYear.selectByVisibleText("2021");
		driver.findElement(By.xpath(AssignLeaveModule.fromdate)).click();
		
		driver.findElement(By.id(AssignLeaveModule.todatebox)).click();
		Select toMonth = new Select(driver.findElement(By.xpath(AssignLeaveModule.tomonth)));
		toMonth.selectByVisibleText("Jan");
		Select toYear = new Select(driver.findElement(By.xpath(AssignLeaveModule.toyear)));
		toYear.selectByVisibleText("2021");
		driver.findElement(By.xpath(AssignLeaveModule.todate)).click();
		
		driver.findElement(By.id(AssignLeaveModule.comments)).sendKeys("None");
		
		driver.findElement(By.id(AssignLeaveModule.submit)).click();
		
		System.out.println("Assign Leave Test Successful");
	}
	
	
}
