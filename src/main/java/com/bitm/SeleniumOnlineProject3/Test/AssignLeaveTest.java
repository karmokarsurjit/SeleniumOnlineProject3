package com.bitm.SeleniumOnlineProject3.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.bitm.SeleniumOnlineProject3.DTO.AssignLeaveDTO;
import com.bitm.SeleniumOnlineProject3.DataProvider.AssignLeaveDataProvider;
import com.bitm.SeleniumOnlineProject3.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject3.Utils.XpathUtils.AssignLeaveModule;

public class AssignLeaveTest {

	private WebDriver driver = null;

	@Test(dataProvider="assignleavedata", dataProviderClass = AssignLeaveDataProvider.class)
	public void assignLeaveTest(List<AssignLeaveDTO> assigndata) {
		driver = DriverManager.driver;
		for (AssignLeaveDTO assignleave : assigndata) {
			
			driver.findElement(By.xpath(AssignLeaveModule.assignBtn)).click();

			driver.findElement(By.id(AssignLeaveModule.empname)).sendKeys(assignleave.getName());

			Select leaveType = new Select(driver.findElement(By.xpath(AssignLeaveModule.leavetype)));
			leaveType.selectByVisibleText("US - Personal");

			driver.findElement(By.id(AssignLeaveModule.fromdatebox)).click();
			Select fromMonth = new Select(driver.findElement(By.xpath(AssignLeaveModule.frommonth)));
			fromMonth.selectByVisibleText("Dec");
			Select fromYear = new Select(driver.findElement(By.xpath(AssignLeaveModule.fromyear)));
			fromYear.selectByVisibleText("2020");
			WebElement dateWidget_from = driver.findElement(By.className("ui-datepicker-calendar"));
			List<WebElement> columns_from = dateWidget_from.findElements(By.tagName("td"));
			for (WebElement cell : columns_from) {
				if (cell.getText().equals("15")) {
					cell.findElement(By.linkText("15")).click();
					break;
				}
			}

			driver.findElement(By.id(AssignLeaveModule.todatebox)).click();
			Select toMonth = new Select(driver.findElement(By.xpath(AssignLeaveModule.tomonth)));
			toMonth.selectByVisibleText("Dec");
			Select toYear = new Select(driver.findElement(By.xpath(AssignLeaveModule.toyear)));
			toYear.selectByVisibleText("2020");
			WebElement dateWidget_to = driver.findElement(By.className("ui-datepicker-calendar"));
			List<WebElement> columns_to = dateWidget_to.findElements(By.tagName("td"));
			for (WebElement cell : columns_to) {
				if (cell.getText().equals("18")) {
					cell.findElement(By.linkText("18")).click();
					break;
				}
			}

			driver.findElement(By.id(AssignLeaveModule.comments)).sendKeys(assignleave.gatComments());

			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AssignLeaveModule.submit)));
			driver.findElement(By.id(AssignLeaveModule.submit)).click();
		}
		
		System.out.println("Assign Leave Test Successful");
	}

}