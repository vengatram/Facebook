package org.fb.testcase;

import org.fb.pages.LoginPage;
import org.fb.pages.NextPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.utility.Base;

public class LoginPageTest extends Base {
	static WebDriver driver;
	 LoginPage loginPage;
	 static Base base;
	 NextPage next;
	@Before
	public  void launchBrowser() {
		base = new Base();
		driver=base.getDriver();

	}
	@Test
	public  void verifyLogin() {
		loginPage=new LoginPage(driver);
		next=new NextPage(driver);
		getScreenShot("facebookPage");
		setText(loginPage.getTxtFirstName(), readValueFromExcelSheet().get(1)
				.get("Firstname"));
		getScreenShot("firstname");
		setText(loginPage.getTxtSurName(), readValueFromExcelSheet().get(1)
				.get("Surname"));
		getScreenShot("lastname");
		setText(loginPage.getTxtMobileNum(), readValueFromExcelSheet().get(1)
				.get("Mobile"));
		getScreenShot("mobile");
		setText(loginPage.getTxtPassword(), readValueFromExcelSheet().get(1)
				.get("Password"));
		getScreenShot("password");
		
		dropDownSelectVText(loginPage.getDrpDwnDay(),"16");
		dropDownSelectVText(loginPage.getDrpDwnMonth(),"Nov");
		dropDownSelectVText(loginPage.getDrpDwnYear(), "1993");
		clickBtn(loginPage.getBtnMale());
		clickBtn(loginPage.getBtnSignup());
	}
	@After
	public  void closeBrowser() {
		driver.quit();

	}

}
