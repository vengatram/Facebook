package org.fb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextPage {
	WebDriver driver;
	@FindBy(xpath="//*[text()='Recover Your Account']")
	private WebElement txtRecover;
	
	public WebElement getTxtRecover() {
		return txtRecover;
	}

	public void setTxtRecover(WebElement txtRecover) {
		this.txtRecover = txtRecover;
	}

	public NextPage(WebDriver ldriver) {
		   this.driver=ldriver;
		PageFactory.initElements(driver, this);
		
	}

}
