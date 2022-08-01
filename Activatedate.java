package org.stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Activatedate extends Baseclass {
	public Activatedate() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@ng-show='showActivationDateField']//child::div//child::input")
	private WebElement clickdate;
	@FindBy(xpath="//div[@ng-show='showActivationDateField']//child::div//child::table[@class='ng-scope ng-isolate-scope']//child::tr[7]//child::td//child::a")
	private WebElement todaydate;
	@FindBy(id="save")
	private WebElement submitbtn;
	public WebElement getTodaydate() {
		return todaydate;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}


	public WebElement getClickdate() {
		return clickdate;
	}

	public void activatedate() {
		click(getClickdate());
		click(getTodaydate());
		click(getSubmitbtn());
	}
}
