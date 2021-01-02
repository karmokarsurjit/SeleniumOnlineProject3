package com.bitm.SeleniumOnlineProject3.Utils;

public class XpathUtils {

	public static class LogInModule {

		public static final String username = "/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input";
		public static final String password = "/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input";
		public static final String LoginBtn = "btnLogin";
	}

	public static class AssignLeaveModule {
		
		public static final String assignBtn = "/html/body/div[1]/div[3]/div/div[2]/div[1]/div/div/div/fieldset/div/div/table/tbody/tr/td[1]/div/a/img";
		
		public static final String empname = "assignleave_txtEmployee_empName";
		
		public static final String leavetype = "/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[2]/select";
		
		public static final String fromdatebox = "assignleave_txtFromDate";
		public static final String frommonth = "/html/body/div[3]/div/div/select[1]";
		public static final String fromyear = "/html/body/div[3]/div/div/select[2]";
		public static final String fromdate = "/html/body/div[3]/table/tbody/tr[2]/td[2]/a";
		
		public static final String todatebox = "assignleave_txtToDate";
		public static final String tomonth = "/html/body/div[3]/div/div/select[1]";
		public static final String toyear = "/html/body/div[3]/div/div/select[2]";
		public static final String todate = "/html/body/div[3]/table/tbody/tr[2]/td[4]/a";
		
		public static final String comments = "assignleave_txtComment";
		
		public static final String submit = "assignBtn";
	}

}