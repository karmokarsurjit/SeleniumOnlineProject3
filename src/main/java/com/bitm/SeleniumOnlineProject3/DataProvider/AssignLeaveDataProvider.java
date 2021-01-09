package com.bitm.SeleniumOnlineProject3.DataProvider;

import org.testng.annotations.DataProvider;

import com.bitm.SeleniumOnlineProject3.Utils.ExcelUtils;

public class AssignLeaveDataProvider {

	@DataProvider(name = "assignleaveData")
	public static Object[][] getLoginData() {
		try {
			return new Object[][] { { ExcelUtils.getAssignLeaveData() }, };
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
