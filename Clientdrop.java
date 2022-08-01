package org.stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clientdrop extends Baseclass {
	public Clientdrop() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="client-dropdown")
	private WebElement clntdropdown;
	public WebElement getClntdropdown() {
		return clntdropdown;
	}
	@FindBy(xpath="//a[@id='client-dropdown']//following::ul[@id='swatch-menu']//child::a[text()='Clients']")
	private WebElement selectdropdown;

	public WebElement getSelectdropdown() {
		return selectdropdown;
	}
	@FindBy(xpath="//a[@href='#/createclient']")
	private WebElement createclnt;
	public WebElement getCreateclnt() {
		return createclnt;
	}
	public void dropdown() {
		movetoelement(getClntdropdown());
		movetoelement(getSelectdropdown());
		click(getSelectdropdown());
		javaclick(getCreateclnt());

	}
}
