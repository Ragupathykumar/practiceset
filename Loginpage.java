package org.stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage  extends Baseclass{
	public Loginpage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="oid")
	private WebElement orgid;

	@FindBy(id="uid")
	private WebElement textuser;
	
	@FindBy(id="pwd")
	private WebElement textpassword;
	
	@FindBy(id="login-button")
	private WebElement loginbtn;

	public WebElement getOrgid() {
		return orgid;
	}
	public WebElement getTextuser() {
		return textuser;
	}

	public WebElement getTextpassword() {
		return textpassword;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void login(String orgid,String username,String password) {
		type(getOrgid(), orgid);
		type(getTextuser(), username);
		type(getTextpassword(), password);
		click(getLoginbtn());
	}
}
