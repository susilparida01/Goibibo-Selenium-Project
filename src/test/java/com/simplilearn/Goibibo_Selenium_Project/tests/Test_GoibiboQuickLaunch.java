package com.simplilearn.Goibibo_Selenium_Project.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.simplilearn.Goibibo_Selenium_Project.pages.LoginPage;

public class Test_GoibiboQuickLaunch extends BaseTest {
	
	@Test(description = "Simple test to launch Goibibo Flight Ticket Web site")
	public void test() {
		
		LoginPage login = new LoginPage(driver);
		
	}

}
