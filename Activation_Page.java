package org.stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Activation_Page extends Baseclass{
	public Activation_Page() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@class='row col-md-12 col-sm-12']//child::span[2]//child::a")
	private WebElement clntact;
	public WebElement getClntact() {
		return clntact;
	}
	public void activateuser() {
		click(getClntact());
	}
}
