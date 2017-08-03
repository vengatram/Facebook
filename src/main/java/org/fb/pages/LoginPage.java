package org.fb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class LoginPage {
	static WebDriver driver;
	@FindBy(id="u_0_2")
	private WebElement txtFirstName;
	@FindBy(id="u_0_4")
	private WebElement txtSurName;
	@FindBy(id="u_0_7")
	private WebElement txtMobileNum;
	
	@FindBy(id="u_0_e")
	private WebElement txtPassword;
	@FindBy(id="day")
	private WebElement drpDwnDay;
	@FindBy(id="month")
	private WebElement drpDwnMonth ;
	@FindBy(id="year")
	private WebElement drpDwnYear;
	@FindBy(id="u_0_i")
	private WebElement btnMale;
	@FindBy(id="u_0_m")
	private WebElement btnSignup;
	
	public LoginPage(WebDriver ldriver) {
		   this.driver=ldriver;
		PageFactory.initElements(driver, this);
		
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtSurName() {
		return txtSurName;
	}

	public WebElement getTxtMobileNum() {
		return txtMobileNum;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getDrpDwnDay() {
		return drpDwnDay;
	}

	public WebElement getDrpDwnMonth() {
		return drpDwnMonth;
	}

	public WebElement getDrpDwnYear() {
		return drpDwnYear;
	}

	public WebElement getBtnMale() {
		return btnMale;
	}

	public WebElement getBtnSignup() {
		return btnSignup;
	}

	
	
}
